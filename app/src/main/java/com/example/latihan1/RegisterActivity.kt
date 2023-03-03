package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan1.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnToLogin()
    }

    private fun btnToLogin() {
        binding.btnSignin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}