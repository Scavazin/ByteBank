class Funcionario(
    val nome:String,
    val cpf : Int,
    var salario : Double = 4000.0
    ){
    fun bonificacao(): Double{
       return salario*0.1
     }

}