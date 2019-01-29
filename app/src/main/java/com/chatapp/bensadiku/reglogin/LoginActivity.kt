package com.chatapp.bensadiku.reglogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chatapp.bensadiku.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button_login.setOnClickListener {
            val email = email_edittext_login.text.toString()
            val password= password_edittext_login.text.toString()

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password).addOnCompleteListener {

            }
        }

        back_to_register_textview.setOnClickListener {
            finish()
        }
    }
}
