package com.pmdm.virgen.listcarddog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.pmdm.virgen.listcarddog.data.Dog
import androidx.compose.foundation.lazy.items

/*
Lista de Perros. Llamaremos por perro a DogItem
 */
@Composable
fun DogList(dogs: List<Dog>){
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 30.dp, vertical = 30.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ){
        items(dogs){
            dog-> DogItem(dog)
        }
    }
}

