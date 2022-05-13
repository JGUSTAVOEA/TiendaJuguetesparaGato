package com.example.tiendajuguetesparagato.productos

import com.example.tiendajuguetesparagato.R

class catalogoProductos {

    companion object{

        val listaProductos = listOf<datosProductos>(
            datosProductos(
                "Fancy Pets Ratones",
                154.71,
                "Animales",
                "Para interactuar, diseñado para satisfacer las necesidades de juego del gato, ya que estimula su instinto de persecución.",
                R.drawable.ratonesparagato
            ),
            datosProductos(
                "Torre Para Gatos KITTEN",
                180.00,
                "Torres",
                "Torre para gatos con pelotas, resistente y divertido.",
                R.drawable.torrepararatones
            ),
            datosProductos(
                "Pez amarillo Sunnimix",
                227.32,
                "Animales",
                " Estos juguetes para gatitos se moverán o se moverán automáticamente y emitirán un sonido.",
                R.drawable.pezamarillojuguete
            ),
            datosProductos(
                "Túneles de gato plegable",
                526.89,
                "Tunel",
                "Libre para jugar en interiores y exteriores, muy adecuado para gatos.",
                R.drawable.tunelparagatos
            ),
            datosProductos(
                "Peces interactivos Sunnimix",
                233.34,
                "Animales",
                "Este juguete de gatito vivo en 3D parece un pez real, mantendrá a tu gatito involucrado en tiempo real.",
                R.drawable.pezinteractivo
            ),
            datosProductos(
                "RATONES NATURANCE",
                154.71,
                "Animales",
                "Ratones elaborados con fibras naturales, con relleno tipo sonaja y colas de plumas, en tamaño ideal.",
                R.drawable.ratonesdetela
            ),
            datosProductos(
                "Escondite",
                258.99,
                "Tuneles",
                "Mantenga a su gato activo y saludable mientras intenta perseguir al ratón.",
                R.drawable.escondite
            ),
            datosProductos(
                "Tubo interactivo Sunnimix",
                484.77,
                "Tuneles",
                "Túnel para gatos Tree Hole, hecho de fieltro grueso y suave, que que los gatos se sientan seguros mientras caminan.",
                R.drawable.tubointeractivo
            )
        )

    }

}