package com.example.pruebas

class CorreoDecorator(contenido: Componente) : BaseDecorator(contenido) {
    override fun cuenta(): Int {
        val cantidad: Int = super.cuenta()
        println("Te llegará un paquete de ${cantidad} sobres. Aviso por correo")
        return cantidad
    }
}