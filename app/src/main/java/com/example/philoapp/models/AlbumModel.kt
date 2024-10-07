package com.example.philoapp.models

data class AlbumModel(

    val name : String,
    val coverUrl : String,
    val songs : List<String>

) {
     constructor() : this("","", listOf())
}
