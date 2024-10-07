package com.example.philoapp

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.philoapp.models.SongsModel

object MyExoplayer {

    private var exoPlayer : ExoPlayer? = null
    private var currentSong : SongsModel? = null

    fun getCurrentSong() : SongsModel?{

        return currentSong

    }

    fun getInstance() : ExoPlayer? {

        return exoPlayer
    }

    fun startPlaying(context : Context, song : SongsModel){

        if(exoPlayer==null)
            exoPlayer = ExoPlayer.Builder(context).build()

        if (currentSong != song){

            currentSong = song
            currentSong?.url?.apply {

                val mediaItem = MediaItem.fromUri(this)
                exoPlayer?.setMediaItem(mediaItem)
                exoPlayer?.prepare()
                exoPlayer?.play()


            }

        }



    }

}