package com.example.amparame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.amparame.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.btConfirm.setOnClickListener {
            val password = binding.editPassword.text.toString()
            val passwordConfirmation = binding.editConfirmPassword.text.toString()
            val inputEmail = binding.editEmail?.text.toString()
            val inputUsername = binding.editUsername.text.toString()

            if (password == passwordConfirmation && password.isNotEmpty() && passwordConfirmation.isNotEmpty() && inputEmail.isNotEmpty() && inputUsername.isNotEmpty()) {
                val intent = Intent(this, Feed::class.java)
                startActivity(intent)
                finish()
            } else if(password != passwordConfirmation) {
                Toast.makeText(this, "${getString(R.string.passwords_are_not_the_same)}", Toast.LENGTH_SHORT).show()
            } else (
                    Toast.makeText(this, "${getString(R.string.empty_field)}", Toast.LENGTH_SHORT).show()
                    )
        }

        binding.btGoBack.setOnClickListener {
            val returnToLogin = Intent(this,Login::class.java)
            startActivity(returnToLogin)
        }
    }
}