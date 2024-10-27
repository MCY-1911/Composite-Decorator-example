package com.example.pruebas

fun main() {
    println("Demo Empaquetador de Té...")
    val paqueteClienteUno: Caja = Caja()
    paqueteClienteUno.add(TeBlanco())
    paqueteClienteUno.add(TeBlanco())
    paqueteClienteUno.add(TeVerde())

    val paqueteClienteDos: Caja = Caja()
    paqueteClienteDos.add(TeVerde())
    paqueteClienteDos.add(TeVerde())
    paqueteClienteDos.add(TeBlanco())

    val envio: Caja = Caja()
    envio.add(paqueteClienteUno)
    envio.add(paqueteClienteDos)

    val cantidad: Int = envio.cuenta()
    println("El envío a Asia contiene $cantidad unidades de té")
}