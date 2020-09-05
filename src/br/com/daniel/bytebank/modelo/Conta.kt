package br.com.daniel.bytebank.modelo

import java.lang.IllegalArgumentException

abstract class Conta(
        val titular: Cliente,
        val numero: Int,
        saldo: Double = 0.0) { //construtor primario (ideal quando for apenas inicialização.

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
            throw IllegalArgumentException("Falha ao realizar o saque")
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