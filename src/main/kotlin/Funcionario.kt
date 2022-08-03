class Funcionario(
    val nome:String,
    val cpf : Int,
    val salario : Double,
    val tipo: Int //0 funcionario, 1 gerente, 2 diretor
    ){
    fun bonificacao(): Double = when(tipo) {
       0 -> salario*0.1
       1 -> salario*0.2
       2 -> salario*0.3
        else -> 0.0
     }
}