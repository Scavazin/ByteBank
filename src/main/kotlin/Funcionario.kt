open class Funcionario(
    val nome:String,
    val cpf : Int,
    var salario : Double
    ){
    // Comp property
    open fun bonificacao(): Double = salario * 0.1
// Como função
   //  open val bonificacao: Double get() = salario * 0.1
}