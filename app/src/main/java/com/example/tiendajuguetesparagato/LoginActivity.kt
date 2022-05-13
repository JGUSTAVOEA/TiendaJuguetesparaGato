package com.example.tiendajuguetesparagato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn = findViewById<Button>(R.id.btnRegistrar)
        btn.setOnClickListener{
            val lanzar = Intent(this, RegistroActivity::class.java)
            startActivity(lanzar)
        }


        //Para entrar en la tienda despues de iniciar sesion
        val btn_is = findViewById<Button>(R.id.button2)
        btn_is.setOnClickListener{
            val lanzar = Intent(this, TiendaJuguetesActivity::class.java)
            startActivity(lanzar)
        }
    }
}