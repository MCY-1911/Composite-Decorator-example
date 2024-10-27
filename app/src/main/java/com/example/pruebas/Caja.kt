package com.example.pruebas

class Caja: Componente {
    private val contenido: MutableList<Componente> = mutableListOf()

    fun add(componente: Componente) {
        if (componente::class == TeVerde::class)
            println("Añado una caja de Te Verde")
        else if (componente::class == TeBlanco::class)
            println("Añado una caja de Te Blanco")
        else
            println("Añado una caja de Paquete de cajas")
        contenido.add(componente)
    }

    fun remove(componente: Componente) {
        contenido.remove(componente)
    }

    fun getChildren(): MutableList<Componente> {
        return contenido
    }

    override fun cuenta(): Int {
        var sobres = 0
        for (componente in contenido)
            sobres += componente.cuenta()
        println("Este paquete consta de $sobres unidades")
        return sobres
    }
}