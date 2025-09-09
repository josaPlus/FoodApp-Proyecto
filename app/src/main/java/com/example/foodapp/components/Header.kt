package com.example.foodapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.colorIcono

@Composable
fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // GRUPO DE ICONO Y SALUDO
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Icono de cuenta",
                modifier = Modifier
                    .size(40.dp),
                tint = colorIcono
            )

            Text(
                text = "Hola, Josafat",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(start = 8.dp)
            )
        }

        // ICONO PARA SALIR
        Icon(
            imageVector = Icons.Default.ExitToApp,
            contentDescription = "Salida",
            tint = colorIcono,
            modifier = Modifier.size(40.dp)
        )
    }
}
