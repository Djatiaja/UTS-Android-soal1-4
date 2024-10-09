package com.example.project_uts_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project_uts_1.databinding.ActivitySoal1Binding

class soal1 : AppCompatActivity() {
    lateinit var binding: ActivitySoal1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoal1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            nameValue.text = intent.getStringExtra("name")
            buttonKeluar.setOnClickListener(){
                val intentToLogin = Intent(this@soal1, soal3::class.java)
                startActivity(intentToLogin)
            }
        }
    }
}