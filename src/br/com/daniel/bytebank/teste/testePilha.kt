package br.com.daniel.bytebank.teste

class testePilha {

    fun funcao1 (){
        println("Inicio funcao1")
        funcao2()
        println("Fim funcao1")
    }

    fun funcao2 (){
        println("Inicio funcao2")
        funcao3()
        println("Fim funcao2")
    }

    fun funcao3 (){
        println("Inicio funcao3")
        for (i in 1 .. 5){
            println(i)
        }
        println("Fim funcao3")
    }
}