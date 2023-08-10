package com.pmdm.virgen.listcarddog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.virgen.listcarddog.data.DogRepository


/*
Posicionaremos elementos usando Row y Column
Cargaremos imágenes desde DogAPI
Cada item de mascota será un elemento DogItem
Utilizaremos el componente LazyColumn
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@Composable
fun MainScreen(){
    //Llamaremos
    DogList(dogs = DogRepository.dogList)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}