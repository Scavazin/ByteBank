class Diretor( val nome:String,
               val cpf : Int,
               val salario : Double =25000.00,
               var senha: Int

               ) {
    fun bonificacao(): Double{
        return salario*0.3
    }
    fun autentica(senha : Int): Boolean {
        return this.senha==senha
    }
}