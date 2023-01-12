package com.shadman.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shadman.test3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = getString(R.string.this_is_text)
        binding.button.text = getString(R.string.click_me)

        binding.button.setOnClickListener { view ->
            when {
                BuildConfig.DEBUG -> Toast.makeText(this, getString(R.string.this_is_debug_build), Toast.LENGTH_SHORT)
                    .show()
                else -> Toast.makeText(this, getString(R.string.this_is_release_build), Toast.LENGTH_LONG)
                    .show()
            }
        }
        Toast.makeText(this,getString(R.string.some_text), Toast.LENGTH_LONG).show()

    }
}