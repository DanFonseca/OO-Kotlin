package br.com.daniel.bytebank.teste

import br.com.daniel.bytebank.modelo.*

fun testObjects() {
    val calculadora = CalculadoraBonificacao()


    val daniel = Gerente(
            "Daniel",
            "11-232-445-69",
            5000.0,
            17000.0,
            1236
    )

    println(daniel.salario)
    println("Bonificacao: ${daniel.bonificacao()}")
    calculadora.registra(daniel)

    val jorgin = Analista(
            "Daniel",
            3500.0,
            "56-56526-6565-22"
    )
    println("Jorgin")
    println(jorgin.salario)
    println("Bonificacao: ${jorgin.bonificacao()}")

    val pedrin = Diretor(
            nome = "pedrin",
            salario = 2000.0,
            cpf = "123.124.569-99",
            PLR = 4000.0,
            senha = 1234
    )

    // Object Expressions
    var cecilia = object :
            IAutentica {

        var titular = "Cecilia"
        val numero = 123
        val saldo = 500.0

        override fun autenticar(senha: Int): Boolean {
            return senha == senha
        }

    }

    println("pedrin")
    println(pedrin.salario)
    println("Bonificacao: ${pedrin.bonificacao()}")

    calculadora.registra(pedrin)
    println("Total: ${calculadora.total}")

    val sistema = SistemaInterno()
    sistema.entrar(123, cecilia)
    val criarConta = criarConta()
}