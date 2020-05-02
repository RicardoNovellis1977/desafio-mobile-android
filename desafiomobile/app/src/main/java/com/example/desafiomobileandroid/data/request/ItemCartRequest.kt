package com.example.desafiomobileandroid.data.request

import com.example.desafiomobileandroid.data.model.ItemCart
import com.example.desafiomobileandroid.data.service.ItemCartService
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class ItemCartRequest(private val itemCartService : ItemCartService): ItemCartContract {
    override fun getItemCart():Observable<List<ItemCart>> {
        return itemCartService
            .getRepositories()
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
    }
}