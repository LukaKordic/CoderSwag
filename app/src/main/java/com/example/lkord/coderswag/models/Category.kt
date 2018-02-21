package com.example.lkord.coderswag.models

data class Category(val title: String = "", val image: String = "") {
    override fun toString(): String {
        return title
    }
}