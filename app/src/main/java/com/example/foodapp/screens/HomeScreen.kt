package com.example.foodapp.screens

import android.R.attr.category
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.components.Categorias
import com.example.foodapp.components.FoodList
import com.example.foodapp.components.Header
import com.example.foodapp.components.RestauranteList
import com.example.foodapp.models.Categoria
import com.example.foodapp.models.restaurantes
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.colorIcono

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .padding(8.dp)
    ) {
        // HEADER
        Header()

        //CATEGORIAS
        Categorias()

        // Lista de Restaurantes
        RestauranteList()

        // LISTA DE ALIMENTOS
        FoodList()
    }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    FoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}