package com.example.marketdataapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.marketdataapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val marketData = listOf(
            "BTC → $42,350",
            "ETH → $2,280",
            "EURUSD → 1.09"
        )

        binding.textView.text = marketData.joinToString("\n")

        binding.btnNotebooks.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                "https://github.com/cloudassistpro/market-data-notebooks".toUri()
            )
            startActivity(intent)
        }


    }
}
