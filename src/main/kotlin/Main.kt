fun main() {
    println("Bem vindo ao Byte Bank")
    testaComportamentosConta()
}
fun testaCondicoes(saldo: Double) {
    if (saldo > 0) println("Saldo positivo")
    else if (saldo == 0.0) println("Saldo zero")
    else println("Saldo negativo")
}

