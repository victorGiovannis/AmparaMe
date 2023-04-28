package com.example.amparame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.amparame.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btLogin.setOnClickListener {
            val email = binding.editUsernameEmail.text.toString()
            val password = binding.editPassword.text.toString()

            if (email == "admin@admin" || email == "Victor" && password == "123456") {
                val intent = Intent(this, Feed::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "${getString(R.string.login_failed)}", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.txtRegistrationScreen.setOnClickListener {
            val browseRegisterScreen = Intent(this,Feed::class.java)
            startActivity(browseRegisterScreen)
        }
    }
}