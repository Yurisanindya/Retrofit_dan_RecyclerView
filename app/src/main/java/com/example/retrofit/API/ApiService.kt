package com.example.retrofit.API

import com.example.retrofit.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET(value = "character")
    fun getMorty() : Call<ResponseMorty>

}