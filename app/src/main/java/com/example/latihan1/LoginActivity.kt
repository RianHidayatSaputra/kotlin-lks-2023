package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnToRegister()
    }
    private fun btnToRegister() {
        binding.btnReg.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}