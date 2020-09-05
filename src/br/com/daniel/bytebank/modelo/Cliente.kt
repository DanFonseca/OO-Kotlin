package br.com.daniel.bytebank.modelo

class Cliente (
        var nome: String,
        var email: String,
        val senha: Int,
        var endereco: Endereco = Endereco()
) : IAutentica {


    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "$nome, Bairro: ${endereco.bairro} numero: ${endereco.numero}"
    }
}