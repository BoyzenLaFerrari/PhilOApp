package com.example.philoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.philoapp.Music.MusicActivity
import com.example.philoapp.databinding.ActivityLoginsBinding
import com.example.philoapp.databinding.ActivitySignInBinding
import com.example.philoapp.models.MusicActivity1
import com.google.firebase.auth.FirebaseAuth

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.login.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passEt.text.toString()

            firebaseAuth.signInWithEmailAndPassword(email , pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val intent = Intent(this, MusicActivity1::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}