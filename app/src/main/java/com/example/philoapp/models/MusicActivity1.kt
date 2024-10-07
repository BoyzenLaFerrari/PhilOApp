package com.example.philoapp.models

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.philoapp.adapter.AlbumsAdapter
import com.example.philoapp.databinding.ActivityMusic1Binding

import com.google.firebase.firestore.FirebaseFirestore

class MusicActivity1 : AppCompatActivity() {

    private lateinit var binding:ActivityMusic1Binding
    private lateinit var albumsAdapter: AlbumsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityMusic1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        getAlbums()



    }

    private fun getAlbums(){
        FirebaseFirestore.getInstance().collection("ArtistAlbums").get().addOnSuccessListener {
            val albumsList = it.toObjects(AlbumModel::class.java)
            setupAlbumsRecyclerView(albumsList)
        }
    }

    private fun setupAlbumsRecyclerView(albumList: List<AlbumModel>){
        albumsAdapter = AlbumsAdapter(albumList)
        binding.albumsRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.albumsRecyclerView.adapter = albumsAdapter
    }

}