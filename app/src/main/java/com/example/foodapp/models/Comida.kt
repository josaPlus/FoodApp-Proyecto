package com.example.foodapp.models

data class Comida(
    val nombre: String,
    val calificacion: Double,
    val precio: Double,
    val imagen: String
)

val foods = listOf(
    Comida("Whopper", 4.5, 99.9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRSPQci5LTg6sGuu23b8SPy9bb-C3-F2TuBQ&s"),
    Comida("Helado", 4.9, 50.9, "https://api-middleware-mcd.mcdonaldscupones.com/media/image/product\$59b3c7f5-e5fc-446f-b012-caa25de3d4e1/200/200/original?country=mx"),
    Comida("Pollo", 4.7, 110.9, "https://cdn.tictuk.com/06e5ab0b-080f-61c9-122a-b33a808502a4/47e40d45-7024-8aa5-ef2b-ca98e2565229.jpeg?a=0fd15063-ed40-b583-57c5-47e2430edbab"),
    Comida("Mochomos", 3.9, 199.9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTt4e_ZdirXRI3px53zPQvanBJv_94yD9LJ6w&s"),
    Comida("Buffet de parrilla", 5.0, 199.9, "https://lavaka.mx/wp-content/uploads/2022/06/cortes-a-la-parrilla-la-vaka.jpg.webp")
)