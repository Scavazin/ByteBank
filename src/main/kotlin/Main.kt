import java.nio.DoubleBuffer

fun main() {
    val contaA=Conta()
    val contaB=Conta()

    println("Bem vindo ao Byte Bank")

    contaA.titular="Alex"
    contaA.numeroConta=1000
    contaA.saldo=400.0

    contaB.titular="Ana"
    contaB.numeroConta=2000
    contaB.saldo=800.0

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
class Conta{
     var titular = ""
     var numeroConta: Int = 0
     var saldo: Double = 0.0
         set(valor){
            if(valor>=0)
            field=valor
        }

    fun deposita( valor: Double){
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

