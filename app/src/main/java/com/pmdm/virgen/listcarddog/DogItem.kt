package com.pmdm.virgen.listcarddog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.pmdm.virgen.listcarddog.data.Dog

@Composable
fun DogItem(dog: Dog) {
    Card(
        modifier = Modifier.fillMaxWidth(),  //que ocupe todo el ancho del padre
        elevation = 10.dp
    ){
        //Metemos una fila que ocupa todo el ancho del padre
        Row(
           modifier =  Modifier.fillMaxWidth()//que ocupe todo el ancho

        ){
            Image(
                painter = rememberImagePainter(dog.image),
                contentDescription = "",
                modifier = Modifier.size(100.dp),   //tamaño de 100 dp
                contentScale = ContentScale.Crop  //que lo recorte de forma cuadrada y no lo redimensione
            )
            Column(
                modifier = Modifier.padding(start = 20.dp) //que se separe de la izquierda 20 dp
            ){
                Text(
                    text=dog.name,
                    style = MaterialTheme.typography.h4
                )
                Text(
                    text = "Raza: ${dog.breed}",
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = "Edad: ${dog.years}",
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}
