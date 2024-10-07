package com.example.philoapp.models

data class SongsModel(
    val id : String,
    val title : String,
    val subtitle : String,
    val url : String,
    val coverUrl : String,
)
{
    constructor() : this("","","","","")
}