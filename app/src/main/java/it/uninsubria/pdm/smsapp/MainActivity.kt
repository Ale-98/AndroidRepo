package it.uninsubria.pdm.smsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val message = messageText.text.toString()
        val number:String = numberField.text.toString()

        val uri:Uri = Uri.parse("smsto:$number")
        val it = Intent(Intent.ACTION_SENDTO, uri)
        it.putExtra("sms_body", message)
        startActivity(it)
    }

}
