package br.com.daniel.bytebank.modelo

interface IAutentica {

    fun autenticar (senha: Int): Boolean
}