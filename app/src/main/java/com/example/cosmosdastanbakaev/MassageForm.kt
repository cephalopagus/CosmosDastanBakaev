package com.example.cosmosdastanbakaev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_massage_form.*

class MassageForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_massage_form)
        button_send_email.setOnClickListener{

            val strAddress = email_address.text.toString()
            val strTheme = email_theme.text.toString()
            val strText = email_text.text.toString()

            if (strAddress.isNotEmpty() && strTheme.isNotEmpty() && strText.isNotEmpty()){

                val intent = Intent(Intent.ACTION_SEND)

                    intent.putExtra(Intent.EXTRA_EMAIL, strAddress)
                    intent.putExtra(Intent.EXTRA_SUBJECT, strTheme)
                    intent.putExtra(Intent.EXTRA_TEXT, strText)
                    intent.setType("message/rfc822")

                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
            }
            else if (strAddress.isEmpty() || strTheme.isEmpty() || strText.isEmpty()){
                Toast.makeText(applicationContext, "Не все поля заполнены!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}