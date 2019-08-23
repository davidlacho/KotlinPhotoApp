package com.davidlacho.photoapp.API

import com.davidlacho.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by david.lacho on 2019-08-23
 */
interface PhotoAPI {
    @GET("?key=13335954-75a5706846f7b1c7cc312b66b&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}