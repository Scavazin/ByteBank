class ContaCorrente(
    titular : String,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
){
    override fun saca(valor : Double) {
        val valorComTaxa =0.98*valor
        super.saca(valorComTaxa)
    }
}