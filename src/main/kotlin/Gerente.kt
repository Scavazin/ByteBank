class Gerente( val nome:String,
               val cpf : Int,
               val salario : Double = 12000.0,
               var senha: Int
               ) {
    fun bonificacao(): Double{
        return salario*0.2
    }
    fun autentica(senha : Int): Boolean {
        return this.senha==senha
    }
}