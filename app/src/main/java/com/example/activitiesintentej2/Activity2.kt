package com.example.activitiesintentej2

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    fun abrirWeb(view: View) {
//        val mensaje = "Este es un mensaje de ejemplo"
//        val duracion = Toast.LENGTH_SHORT // Puedes usar Toast.LENGTH_SHORT o Toast.LENGTH_LONG
//        val context: Context = applicationContext // Reemplaza "applicationContext" con el contexto apropiado
//        val toast = Toast.makeText(context, mensaje, duracion)
        //val toast = Toast.makeText(context, mensaje, duracion)
        val toast = Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT)
        toast.show()


        val webpage: Uri = Uri.parse("https://www.marca.com")
        val intent = Intent (Intent.ACTION_VIEW, webpage )
        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)}

    }
    fun abrirDial(view: View) {
        val toast = Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT)
        toast.show()
        val num = 666123456
        val intent = Intent (Intent.ACTION_CALL).apply {
            data = Uri.parse("tel:$num")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    fun abrirCorreo(view: View, addresses: Array<String>, subject: String) {
        val destinatario = "m.arana@cesjuanpablosegundocadiz.es"
        val asunto = "Ejercicio Intents"
        val mensaje = "¡Ejercicio resuelto! Tu nombre aquí"


        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, destinatario)
            putExtra(Intent.EXTRA_SUBJECT, asunto)
            putExtra(Intent.EXTRA_TEXT, mensaje)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}