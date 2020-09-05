package br.com.daniel.bytebank.modelo

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,

        val PLR: Double = 0.0,
        val senha: Int

) : Funcionario(nome = nome, cpf = cpf, salario = salario),
        IAutentica {

    override fun bonificacao () : Double =
            salario * 0.1

    fun PLR (): Double {
        return this.salario + PLR;
    }

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}