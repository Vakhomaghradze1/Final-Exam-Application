package com.example.finalurisapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var mainListView: ListView
    private val userNames = listOf<String>(
            "Jack",
            "Michael",
            "Kevin",
            "Logan",
            "Donovan"
    )

    private val userList = listOf<User>(
        User("Monday", "Activities",1),
        User("Tuesday", "Activities",2),
        User("Wednesday", "Activities",3),
        User("Thursday", "Activities",4),
        User("Friday", "Activities",5)

    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainListView = findViewById(R.id.firstPage_ListView)





        mainListView.adapter = ListViewAdapter(this, userList)

        mainListView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Forwarding to To-Do page", Toast.LENGTH_SHORT).show()

            val personalPgIntent = Intent(this, UserDetailedPage::class.java)
            personalPgIntent.putExtra(Constantebi.USER_NAME_KEY, userNames[position])
            startActivity(personalPgIntent)
        }
    }
}


