package com.example.speisekarte.data

data class pizza(
    val name: String,
    val bildResId: Int,
    val zutaten: List<String>,
    val allergien: List<String>,
    val zusatzstoffe: List<String>,
    val preis: String,
)
