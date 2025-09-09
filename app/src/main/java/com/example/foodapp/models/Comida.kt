package com.example.foodapp.models

data class Comida(
    val nombre: String,
    val precio: Double,
    val rating: Float,
    val imageUrl: String,
    val restaurant: Restaurante,
    val category: Categoria
)
