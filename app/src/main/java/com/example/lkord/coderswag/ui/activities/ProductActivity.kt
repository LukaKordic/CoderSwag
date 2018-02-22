package com.example.lkord.coderswag.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.utils.CATEGORY_TITLE_EXTRA

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val receivedTitle = intent.getStringExtra(CATEGORY_TITLE_EXTRA)
        println(receivedTitle)
    }

    companion object {
        fun getLaunchIntent(from: Context) = Intent(from, ProductActivity::class.java)
    }
}

