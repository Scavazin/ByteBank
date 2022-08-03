fun testaComportamentosConta() {
    val contaA = Conta("Alex", 1000)
    val contaB = Conta("Ana", 2000)

    contaA.deposita(400.0)
    contaB.deposita(800.0)

    contaA.saca(500.0)
    contaA.deposita(500.0)

    println("Saldo da ${contaA.titular}: ${contaA.saldo}")

    contaB.saca(300.0)
    contaB.deposita(1000.0)
    println("Saldo da ${contaB.titular}: ${contaB.saldo}")

    contaA.transefere(500.0, contaB)

    println("${contaA.titular} -> ${contaA.saldo}")
    println("${contaB.titular} -> ${contaB.saldo}")
}