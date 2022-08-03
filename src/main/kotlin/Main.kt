import java.nio.DoubleBuffer

fun main() {
    val contaA=Conta("Alex", 1000)
    val contaB=Conta("Ana", 2000)

    println("Bem vindo ao Byte Bank")


    contaA.deposita(400.0)
    contaB.deposita(800.0)

    contaA.saca(500.0)
    contaA.deposita(500.0)

    println("Saldo da ${contaA.titular}: ${contaA.saldo}")

    contaB.saca(300.0)
    contaB.deposita(1000.0)
    println("Saldo da ${contaB.titular}: ${contaB.saldo}")

    contaA.transefere(500.0,contaB)


    println("${contaA.titular} -> ${contaA.saldo}")
    println("${contaB.titular} -> ${contaB.saldo}")
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0) println("Saldo positivo")
    else if (saldo == 0.0) println("Saldo zero")
    else println("Saldo negativo")
}
class Conta( var titular:String,var numeroConta: Int){
 // It could be that, but it is more simple the way it is actually coded
 // The declaration of variables that must have some value is made directly in the constructor

//     var titular = titular
//     var numeroConta = numeroConta
     var saldo: Double = 0.0
         private set
//   The function below is used when needs some logic involved, when this need is not
//   necessary, we use the pattern constructor in Conta(), how it is actually implemented

//    constructor(titular:String, numeroConta: Int){
//        this.titular= titular
//        this.numeroConta=numeroConta
//    }
    fun deposita( valor: Double){
        if(valor>0)
        this.saldo+=valor
    }

    fun saca(valor: Double){
        if(this.saldo>=valor)
            this.saldo-=valor
        else
            println("Seu saldo é de ${this.saldo}. Refaça o pedido de saque até este valor")
    }

    fun transefere(valor: Double, destino: Conta){
        if(saldo>=valor) {
            saldo -= valor
            destino.deposita(valor)
        }
        else
            println("Seu saldo é de ${this.saldo}. Refaça o pedido de transferência até este valor")
    }
}

