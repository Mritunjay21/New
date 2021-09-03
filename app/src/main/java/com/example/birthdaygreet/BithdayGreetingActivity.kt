package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bithday_greeting.*

class BithdayGreetingActivity : AppCompatActivity() {

   /* companion object{
        const val NAME_EXTRA = "name_extra"
    }
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bithday_greeting)

        val name = intent.getStringExtra("name")
        BirthdayGreeting.text = "Happy Birthday \n $name!"


    }
}