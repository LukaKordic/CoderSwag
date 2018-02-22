package com.example.lkord.coderswag.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.datafactory.ProductsFactory
import com.example.lkord.coderswag.ui.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(categoryRecycler) {
            adapter = CategoryAdapter(context, ProductsFactory.categories) {
                startActivity(ProductActivity.getLaunchIntent(context, it.title))
            }
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }
}