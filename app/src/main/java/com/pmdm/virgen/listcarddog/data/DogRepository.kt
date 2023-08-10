package com.pmdm.virgen.listcarddog.data


/*
Como una clase estática de objetos creados
Ya se crea una instancia llamada DogProvider. Lo hacemos por medio de DogProvideer
La diferencia, es que no podemos instanciar de un object, sino que lo estamos creando directamente.

 */
object  DogRepository {
    val dogList = listOf(
        Dog(name = "Iris", breed = "Maltes", years = 11, image="https://images.dog.ceo/breeds/affenpinscher/n02110627_9634.jpg"

        ),
        Dog(name="Paquito", breed = "Affenpincher", years = 2, image="https://images.dog.ceo/breeds/affenpinscher/n02110627_12272.jpg"

        ),
        Dog(
            name="luna", breed = "Airedale", years = 3, image="https://images.dog.ceo/breeds/airedale/n02096051_2583.jpg"
        ),
        Dog(
            name="lobo", breed = "Cardigan", years = 8, image="https://images.dog.ceo/breeds/corgi-cardigan/n02113186_1016.jpg"

        ),
        Dog(
            name= "alert", breed = "hound", years = 10, image= "https://images.dog.ceo/breeds/hound-english/n02089973_2608.jpg"

        ),
        Dog(name = "Iris", breed = "Maltes", years = 11, image="https://images.dog.ceo/breeds/affenpinscher/n02110627_9634.jpg"

        ),
        Dog(name="Paquito", breed = "Affenpincher", years = 2, image="https://images.dog.ceo/breeds/affenpinscher/n02110627_12272.jpg"

        ),
        Dog(
        name="luna", breed = "Airedale", years = 3, image="https://images.dog.ceo/breeds/airedale/n02096051_2583.jpg"
        ),
        Dog(
        name="lobo", breed = "Cardigan", years = 8, image="https://images.dog.ceo/breeds/corgi-cardigan/n02113186_1016.jpg"

        ),
        Dog(
        name= "alert", breed = "hound", years = 10, image= "https://images.dog.ceo/breeds/hound-english/n02089973_2608.jpg"

        )
    )
}