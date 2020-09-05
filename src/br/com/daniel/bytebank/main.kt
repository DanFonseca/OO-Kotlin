package br.com.daniel.bytebank

import br.com.daniel.bytebank.modelo.ContaPoupanca
import br.com.daniel.bytebank.teste.testePilha

fun main (){

    testePilha().funcao1()
    
    //try expressioons
    val entrada = "1"

    val valorConvertido = try {
        entrada.toDouble()
    }catch (e: RuntimeException){
        null
    }

    //Elvis operator to verify if the value is null
    println(valorConvertido ?: "Valor inválido")
}

fun verifica (obj: Any?) : Any?{
    return if(obj is ContaPoupanca)
        "é uma conta poupanca!"
    else
        ""
}




