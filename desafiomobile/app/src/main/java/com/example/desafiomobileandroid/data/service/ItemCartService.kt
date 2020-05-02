package com.example.desafiomobileandroid.data.service

import com.example.desafiomobileandroid.data.model.ItemCart
import io.reactivex.Observable
import retrofit2.http.GET

interface ItemCartService {

    @GET
    fun getRepositories(): Observable<List<ItemCart>>
}