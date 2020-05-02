package com.example.desafiomobileandroid.di

import com.example.desafiomobileandroid.features.listagem.ItemCartViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var viewModelModule = module {
    viewModel { ItemCartViewModel(get()) }

}