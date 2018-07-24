package com.raqun.livedata_playground.currentdataawarelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer


class CurrentDataAwareLiveData<T> : MediatorLiveData<T>() {

    override fun <S> addSource(source: LiveData<S>, onChanged: Observer<in S>) {
        super.addSource(source, onChanged)
        if (source.value != null) {
            onChanged.onChanged(source.value)
        }
    }
}