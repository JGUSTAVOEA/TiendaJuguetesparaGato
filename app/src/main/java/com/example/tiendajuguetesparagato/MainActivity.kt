package com.example.tiendajuguetesparagato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMiniciosesion = findViewById<Button>(R.id.btnMainInicioSesion)
        val btnMregistro = findViewById<Button>(R.id.btnMainRegistro)
        val btnMinicio = findViewById<Button>(R.id.btnMainInicio)
        val btnMcontacto = findViewById<Button>(R.id.btnMainContacto)

        btnMiniciosesion.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        btnMregistro.setOnClickListener{
            val intent = Intent(this,RegistroActivity::class.java)
            startActivity(intent)
        }

        btnMinicio.setOnClickListener {
            val intent = Intent(this, TiendaJuguetesActivity::class.java)
            startActivity(intent)
        }
    }
}