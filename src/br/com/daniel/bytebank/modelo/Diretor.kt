package br.com.daniel.bytebank.modelo

class Diretor (
        nome: String,
        cpf: String,
        salario: Double,

        val PLR : Double,
        val senha: Int
)  : Funcionario( nome = nome,cpf = cpf , salario = salario),
        IAutentica {

    override fun bonificacao () : Double =
              PLR + salario

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }


}