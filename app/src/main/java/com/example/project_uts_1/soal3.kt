package com.example.project_uts_1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project_uts_1.databinding.ActivitySoal3Binding

class soal3 : AppCompatActivity() {
    lateinit var binding: ActivitySoal3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoal3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            Toast.makeText(this@soal3, "You have successfully logged out", Toast.LENGTH_SHORT).show()
        }
    }
}