package com.example.activitiesintentej2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val btnDial = findViewById<Button>(R.id.btnDial)

    }

    fun abrirWeb(view: View) {
        val toast = Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT)
        toast.show()

        val webpage: Uri = Uri.parse("https://www.marca.com")
        val intent = Intent (Intent.ACTION_VIEW, webpage )
        startActivity(intent)
   }

    fun abrirDial(view: View) {

        val toast = Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT)
        toast.show()

        val num = 666123456

        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$num")
        }
        startActivity(intent)

    }

    fun abrirCorreo( view: View) {
        val destinatario = "m.arana@cesjuanpablosegundocadiz.es"
        val asunto = "Ejercicio Intents"
        val mensaje = "¡Ejercicio resuelto! Tu nombre aquí"

        val correo = "mailto:m.arana@cesjuanpablosegundocadiz.es" +
                "?subject=" + Uri.encode("Ejercicio Intens") +
                "&body=" + Uri.encode("¡Ejercicio Resuelto! Rafael Quintero Galvín")

        var email : Intent = Intent(Intent.ACTION_SENDTO,Uri.parse(correo))

//
//        val intent = Intent(Intent.ACTION_SENDTO).apply {
//            data = Uri.parse("mailto:$destinatario")
//            putExtra(Intent.EXTRA_SUBJECT, asunto)
//            putExtra(Intent.EXTRA_TEXT, mensaje)
//        }
        startActivity(email)

    }
}