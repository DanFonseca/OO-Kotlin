package br.com.daniel.bytebank.teste

import br.com.daniel.bytebank.modelo.*

fun criarConta() {




    val conta1 = ContaPoupanca(titular = Cliente("Daniel", "daniel@gmail.com", 123), numero = 5252, saldo = 500.0)
    val conta2 = ContaPoupanca(titular = Cliente("Douglas", "douglas@gmail.com", 123), numero = 4221, saldo = 5000.0)
    val conta3 = ContaPoupanca(
            titular = Cliente("Pedro", "pedro@gmail.com", 123, Endereco(
                    logradouro = "Bela Vista 160",
                    numero = 160,
                    bairro = "Paulista",
                    cep = "00011-231"
            )),
            numero = 2165,
            saldo = 7000.0
    )

    val list = mutableListOf<Conta>(conta1, conta2, conta3)
    println("total de contas criadas ${Conta.total}")

    val print = printConta(list)

}
