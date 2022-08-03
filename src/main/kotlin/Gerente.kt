class Gerente( nome:String,
               cpf : Int,
               salario : Double ,
               var senha: Int
               ) : Funcionario(
    nome,
    cpf,
    salario){
    override fun bonificacao(): Double = super.bonificacao() + salario
    fun autentica(senha : Int): Boolean {
        return this.senha==senha
    }
}