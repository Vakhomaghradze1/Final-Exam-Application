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
        User("Jack", "Richer",32),
        User("Michael", "Carter",29),
        User("Kevin", "Durant",31),
        User("Logan", "Noble",61),
        User("Donovan", "Mitchel",25)
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainListView = findViewById(R.id.firstPage_ListView)





        mainListView.adapter = ListViewAdapter(this, userList)

        mainListView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Forwarded To Personal Page", Toast.LENGTH_SHORT).show()

            val personalPgIntent = Intent(this, UserDetailedPage::class.java)
            personalPgIntent.putExtra(Constantebi.USER_NAME_KEY, userNames[position])
            startActivity(personalPgIntent)
        }
    }
}


