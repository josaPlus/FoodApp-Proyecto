package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.models.Categoria
import com.example.foodapp.models.listCategorias
import com.example.foodapp.ui.theme.colorIcono

@Composable
fun Categorias(){

    Text(
        text = "Nuestras categorias",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(bottom = 8.dp)
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(listCategorias) { categoria ->
            categoriaItem(categoria)
        }
    }
}

@Composable
fun categoriaItem(categoria : Categoria){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.width(100.dp)
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(colorIcono),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = categoria.imagenCategoria,
                contentDescription = categoria.nombre,
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Fit
            )
        }

        Text(
            text = categoria.nombre,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}