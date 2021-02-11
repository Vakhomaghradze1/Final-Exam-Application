package com.example.finalurisapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserDetailedPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.to_do_activity_page)

        val userName = intent.getStringExtra(Constantebi.USER_NAME_KEY)
        val userNameTextView = findViewById<TextView>(R.id.userNameTextView)


    }
}