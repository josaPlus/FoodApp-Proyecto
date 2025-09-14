package com.example.foodapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.models.Restaurante
import com.example.foodapp.models.restaurantes

@Composable
fun RestauranteList(){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            "Busca los mejores",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            "Restaurantes",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 5.dp),
            fontWeight = FontWeight.Medium
        )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(restaurantes) { restaurante ->
                RestauranteItem(restaurante = restaurante)
            }
        }

    }
}

@Composable
fun RestauranteItem(restaurante: Restaurante){
    Column(
        modifier = Modifier.width(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = restaurante.imagen,
            contentDescription = restaurante.nombre,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = restaurante.nombre,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 4.dp),
            maxLines = 1
        )
    }
}