package com.example.tiendajuguetesparagato.productosAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendajuguetesparagato.R
import com.example.tiendajuguetesparagato.productos.datosProductos

class productos_adapter (val listaProductos:List<datosProductos>): RecyclerView.Adapter<productosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return productosViewHolder(layoutInflater.inflate(R.layout.lista_productos, parent, false))
    }

    override fun onBindViewHolder(holder: productosViewHolder, position: Int) {
        val item = listaProductos[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listaProductos.size


}