package com.math.matic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.math.matic.databinding.ActivityPersegiBinding

class PersegiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersegiBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersegiBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.apply {
            button.setOnClickListener {
                val panjang = textField.editText?.text.toString().toDouble()
                val lebar = textField2.editText?.text.toString().toDouble()
                val hasil = panjang * lebar
                textResult.text = hasil.toString()
                }
        }
    }
}