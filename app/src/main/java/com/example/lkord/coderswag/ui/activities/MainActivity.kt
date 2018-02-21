package com.example.lkord.coderswag.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.models.Category
import com.example.lkord.coderswag.services.DataService
import com.example.lkord.coderswag.ui.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecycler.layoutManager = LinearLayoutManager(this)
        categoryRecycler.adapter = CategoryAdapter(this, DataService.categories)
        categoryRecycler.setHasFixedSize(true)
    }
}