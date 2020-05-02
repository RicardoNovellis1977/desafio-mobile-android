package com.example.desafiomobileandroid.data.request

import com.example.desafiomobileandroid.data.model.ItemCart
import io.reactivex.Observable

interface ItemCartContract {
    fun getItemCart(): Observable<List<ItemCart>>
}