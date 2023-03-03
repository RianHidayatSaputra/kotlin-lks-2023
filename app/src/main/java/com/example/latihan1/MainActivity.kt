package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihan1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnToLogin()
        setupListener()
        btnToPosts()
    }

    private fun btnToPosts() {
        binding.btnPosts.setOnClickListener {
            startActivity(Intent(this, PostsActivity::class.java))
        }
    }

    private fun btnToLogin() {
        binding.btnMain.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun setupListener() {
        binding?.radioGroup?.setOnCheckedChangeListener { _, i ->
            when (i) {
                R.id.radioLaki -> Toast.makeText(applicationContext, binding.radioLaki.text, Toast.LENGTH_SHORT).show()
                R.id.radioPerempuan -> Toast.makeText(applicationContext, binding.radioPerempuan.text, Toast.LENGTH_SHORT).show()
            }
        }
    }

}
