package com.example.lkord.coderswag.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.services.DataService
import com.example.lkord.coderswag.ui.adapters.CategoryAdapter
import com.example.lkord.coderswag.utils.CATEGORY_TITLE_EXTRA
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecycler.adapter = CategoryAdapter(this, DataService.categories) {
            it -> startActivity(ProductActivity.getLaunchIntent(this).putExtra(CATEGORY_TITLE_EXTRA, it.title))
        }
        categoryRecycler.layoutManager = LinearLayoutManager(this)
        categoryRecycler.setHasFixedSize(true)
    }
}