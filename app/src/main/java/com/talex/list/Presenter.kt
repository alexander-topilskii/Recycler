package com.talex.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainViewModel : ViewModel(), CoroutineScope {

    override val coroutineContext: CoroutineContext = Job() + Dispatchers.Main

    val items = MutableLiveData<List<Item>>()

    init {
        val list = mutableListOf<Item>()
        launch {
            for (i in 0..100) {
                list.add(Item(i))
            }

            items.postValue(list)

        }
    }

}

class Item(val id: Int)