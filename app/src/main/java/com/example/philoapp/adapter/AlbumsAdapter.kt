package com.example.philoapp.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.philoapp.SongsListActivity
import com.example.philoapp.databinding.AlbumsItemRecyclerRowBinding
import com.example.philoapp.models.AlbumModel


class AlbumsAdapter (private val albumsList: List<AlbumModel>) :
    RecyclerView.Adapter<AlbumsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = AlbumsItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bindData(albumsList[position])

    }

    override fun getItemCount(): Int {
        return albumsList.size
    }

    class MyViewHolder(private val binding: AlbumsItemRecyclerRowBinding) : RecyclerView.ViewHolder(binding.root
    ){
        // bind data with views
        fun bindData(artistAlbums :AlbumModel){
            binding.nameTextView.text= artistAlbums.name
            Glide.with(binding.coverImageView).load(artistAlbums.coverUrl)
                .apply(
                    RequestOptions().transform(RoundedCorners(32))
                )
                .into(binding.coverImageView)
            //Log.i("SONGS",artistAlbums.songs.size.toString())

            //Start SongsList Activity
            val context = binding.root.context
            binding.root.setOnClickListener{
                SongsListActivity.ArtistAlbums = artistAlbums
                context.startActivity(Intent(context,SongsListActivity::class.java))
            }
        }
    }

}