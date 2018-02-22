package com.example.lkord.coderswag.ui.activities

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.datafactory.ProductsFactory
import com.example.lkord.coderswag.ui.adapters.ProductAdapter
import com.example.lkord.coderswag.utils.CATEGORY_TITLE_KEY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val receivedTitle = intent.getStringExtra(CATEGORY_TITLE_KEY)
        println(receivedTitle)

        productsHeadline.text = receivedTitle

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) spanCount = 3

        with(productRecycler) {
            adapter = ProductAdapter(context, ProductsFactory.getProducts(receivedTitle))
            layoutManager = GridLayoutManager(context, spanCount)
        }
    }

    companion object {
        fun getLaunchIntent(from: Context, title: String): Intent = Intent(from, ProductActivity::class.java)
                .putExtra(CATEGORY_TITLE_KEY, title)
    }
}

