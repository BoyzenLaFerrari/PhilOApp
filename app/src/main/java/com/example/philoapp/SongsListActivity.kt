package com.example.philoapp

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.philoapp.adapter.SongsListAdapter
import com.example.philoapp.databinding.ActivitySongsListBinding
import com.example.philoapp.models.AlbumModel

class SongsListActivity : AppCompatActivity() {

    companion object{


        lateinit var ArtistAlbums: AlbumModel
    }

    private lateinit var binding: ActivitySongsListBinding
    private lateinit var songsListAdapter: SongsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySongsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameTextView.text = ArtistAlbums.name
        Glide.with(binding.coverImageView).load(ArtistAlbums.coverUrl)
            .apply(
                RequestOptions().transform(RoundedCorners(32))
            )
            .into(binding.coverImageView)

        setupSongsListRecyclerView()

    }

  private fun setupSongsListRecyclerView(){

        songsListAdapter = SongsListAdapter(ArtistAlbums.songs)
        binding.songsListView.layoutManager = LinearLayoutManager(this)
        binding.songsListView.adapter = songsListAdapter

    }
}