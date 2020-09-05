package br.com.daniel.bytebank

import br.com.daniel.bytebank.modelo.Cliente
import br.com.daniel.bytebank.modelo.ContaPoupanca
import br.com.daniel.bytebank.modelo.Endereco

fun main (){
    val poupanca =
            ContaPoupanca (numero = 100, saldo = 500.0,
                    titular = Cliente(
                    nome = "Daniel",
                    email = "daniel@gmail.com",
                    senha = 123,

                    endereco = Endereco(logradouro = "Paulita",
                    numero = 100,
                    cep = "04844221",
                    bairro = "Paulista",
                    complemento = "",
                    estado = "SP")))

    print(verifica(poupanca))

}

fun verifica (obj: Any?) : Any?{
    return if(obj is ContaPoupanca)
        "é uma conta poupanca!"
    else
        ""
}




