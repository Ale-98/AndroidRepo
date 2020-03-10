package it.uninsubria.pdm.smsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * App per invio di un SMS
 * @author Alessandro Cadei 732700
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val message:String = editTextMessage.text.toString() // Estrazione contenuto del messaggio
        val number:String = editTextTel.text.toString() // Estrazione numero di telefono destinatario
        val name:String = "Ciao, sono ALESSANDRO CADEI.\n"

        val uri:Uri = Uri.parse("smsto:$number")
        val it = Intent(Intent.ACTION_SENDTO, uri)
        it.putExtra("sms_body", name+message)
        startActivity(it)
    }

}
