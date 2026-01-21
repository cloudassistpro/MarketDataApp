package com.example.marketdataapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.marketdataapp.databinding.ActivityNotebooksBinding
import androidx.core.net.toUri

class NotebooksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotebooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotebooksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenRepo.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                "https://github.com/tu-usuario/market-data-notebooks".toUri()
            )
            startActivity(intent)
        }
    }
}
