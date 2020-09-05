package br.com.daniel.bytebank.modelo

class ContaPoupanca (
        titular: Cliente,
        numero: Int,
        saldo: Double
)
    : Conta(titular = titular, numero = numero, saldo = saldo) {

    override fun toString(): String {
        return "$titular $numero $saldo"
    }
}