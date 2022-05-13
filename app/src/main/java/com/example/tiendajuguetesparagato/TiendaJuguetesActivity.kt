package com.example.tiendajuguetesparagato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendajuguetesparagato.productos.catalogoProductos
import com.example.tiendajuguetesparagato.productosAdapter.productos_adapter

class TiendaJuguetesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda_juguetes)

        val recyclerView = findViewById<RecyclerView>(R.id.rvProductos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productos_adapter(catalogoProductos.listaProductos)
    }
}