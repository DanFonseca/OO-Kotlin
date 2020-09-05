package br.com.daniel.bytebank.modelo

import br.com.daniel.bytebank.Excpetions.SaldoInsuficienteException
import java.lang.IllegalArgumentException

abstract class Conta(
        val titular: Cliente,
        val numero: Int,
        saldo: Double = 0.0) : IAutentica by titular {
    /*
    Com apenas a syntax Autenticavel by titular, é feita a delegação de implementação.
    A restrição nesse caso é que precisamos operar com properties val,
    pois não é possível modificar a implementação depois de criarmos uma conta.
*/
    var saldo = saldo
        private set  //properties

    companion object { // companion Object, it's looks like private static in Java
        var total = 0
            private set
    }

    init {
        total++
    }

    fun sacar(valor: Double) {
        if (valor <= this.saldo && valor > 0) {
            this.saldo -= valor
        } else {
            throw SaldoInsuficienteException("Valor inválido ou Saldo Insuficiente")
        }
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else {
            throw IllegalArgumentException("Falha ao realizar o deposito")
        }
    }

    fun transferir(conta: Conta, valor: Double) {
        this.sacar(valor)
        conta.deposita(valor)
    }


}