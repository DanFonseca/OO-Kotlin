package br.com.daniel.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        total += funcionario.bonificacao();
    }
}