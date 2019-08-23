package com.davidlacho.photoapp.models

import java.io.Serializable

/**
 * Created by david.lacho on 2019-08-23
 */
data class Photo(
        val id: String,
        val likes: Int,
        val favorites: Int,
        val tags : String,
        val previewURL: String,
        val webformatURL: String) : Serializable {
}