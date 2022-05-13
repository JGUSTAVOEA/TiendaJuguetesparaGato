package com.example.tiendajuguetesparagato.productosAdapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendajuguetesparagato.R
import com.example.tiendajuguetesparagato.productos.datosProductos

class productosViewHolder(view:View): RecyclerView.ViewHolder(view) {

    val nombreJuguete = view.findViewById<TextView>(R.id.txtlistaNombreProducto)
    val precioJuguete = view.findViewById<TextView>(R.id.txtlistaPrecio)
    val categoriaJuguete = view.findViewById<TextView>(R.id.txtlistaCategoria)
    val imagenJuguete = view.findViewById<ImageView>(R.id.listaImageProduct)

    fun render(listaproductos:datosProductos){
        nombreJuguete.text = listaproductos.nombreProducto
        precioJuguete.text = listaproductos.precioProducto.toString()
        categoriaJuguete.text = listaproductos.categoriaProducto
        imagenJuguete.setImageResource(listaproductos.imagenProducto)
    }

}