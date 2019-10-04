package com.kotlin.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var liveData: MutableLiveData<Int>? = MutableLiveData()

    init {
        liveData!!.value = 0;
    }

    fun getCount(): MutableLiveData<Int>? = liveData

    fun updateClickCount() {
        liveData!!.value = liveData!!.value?.plus(1)
    }
}