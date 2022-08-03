import java.nio.DoubleBuffer

fun main() {
    val contaA=Conta()
    val contaB=Conta()

    println("Bem vindo ao Byte Bank")

    contaA.setTitular("Alex")
    contaA.setNumeroConta(1000)
    contaA.setSaldo(400.0)

    contaB.setTitular("Ana")
    contaB.setNumeroConta(2000)
    contaB.setSaldo(800.0)

    contaA.saca(500.0)
    contaA.deposita(500.0)
    println("Saldo da ${contaA.getTitular()}: ${contaA.getSaldo()}")

    contaB.saca(300.0)
    contaB.deposita(1000.0)
    println("Saldo da ${contaB.getTitular()}: ${contaB.getSaldo()}")

    contaA.transefere(500.0,contaB)


    println("${contaA.getTitular()} -> ${contaA.getSaldo()}")
    println("${contaB.getTitular()} -> ${contaB.getSaldo()}")
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0) println("Saldo positivo")
    else if (saldo == 0.0) println("Saldo zero")
    else println("Saldo negativo")
}
class Conta{
    private var titular = ""
    private var numeroConta: Int = 0
    private var saldo: Double = 0.0

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
    fun getSaldo():Double{
        return saldo
    }
    fun setSaldo(valor: Double):Double{
        saldo=valor
        return valor
    }
    fun setTitular(valor: String):String{
        titular=valor
        return valor
    }
    fun setNumeroConta(valor: Int):Int{
        numeroConta=valor
        return valor
    }
    fun getTitular():String{
        return titular
    }
    fun getNumeroConta():Int{
        return numeroConta
    }
}

