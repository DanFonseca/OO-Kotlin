package br.com.daniel.bytebank.modelo

class Analista (nome : String, salario : Double, cpf : String) :
        Funcionario(nome = nome, salario = salario, cpf = cpf) {

    override fun bonificacao(): Double {
        return  salario * 0.1
    }
}