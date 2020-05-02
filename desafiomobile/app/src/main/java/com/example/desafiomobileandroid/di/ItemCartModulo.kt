package com.example.desafiomobileandroid.di

import com.example.desafiomobileandroid.data.request.ItemCartContract
import com.example.desafiomobileandroid.data.request.ItemCartRequest
import org.koin.dsl.module

val itemCartModule = module {
    factory { ItemCartRequest(get()) as ItemCartContract}
}