class Diretor( nome:String,
               cpf : Int,
               salario : Double ,
               var senha: Int,
               val plr: Double
               ): Funcionario(nome, cpf, salario) {
    override fun bonificacao(): Double = super.bonificacao() + salario + plr

    fun autentica(senha : Int): Boolean {
        return this.senha==senha
    }
}