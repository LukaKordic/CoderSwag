package com.example.lkord.coderswag.ui.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lkord.coderswag.R
import com.example.lkord.coderswag.models.Category
import com.example.lkord.coderswag.ui.holders.CategoryHolder

class CategoryAdapter(private val context: Context, private val categories: List<Category>, private val onItemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategoryHolder {
        val itemView: View = LayoutInflater.from(parent?.context).inflate(R.layout.category_list_item, parent, false)
        return CategoryHolder(itemView, onItemClick)
    }


    override fun onBindViewHolder(holder: CategoryHolder?, position: Int) {
        holder?.bindData(context, categories[position])
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
}