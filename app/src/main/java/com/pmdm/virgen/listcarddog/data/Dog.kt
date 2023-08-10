package com.pmdm.virgen.listcarddog.data

/*
Un DataClass es una clase que contiene estado y no realiza ninguna operación
La ventaja de utilizar data class es que nos aporta una cantidad inmensa de código autogenerado.
Nos da de manera gratuíta:
    1.- No necesitamos getters y setters.
    2.-Nos da un par de equals y hashCode
    3.- Nos da un copy.
 */
data class Dog(
    var name:String,
    var breed: String, //raza
    var years: Int,     //años
    var image: String

)
