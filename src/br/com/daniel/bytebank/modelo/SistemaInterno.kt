package br.com.daniel.bytebank.modelo

class SistemaInterno {


    fun entrar (senha: Int, autentica: IAutentica){
        if(autentica.autenticar(senha)){
            println("Bem Vindo!")
        }else{
            println("Senha Incorreta")
        }
    }
}