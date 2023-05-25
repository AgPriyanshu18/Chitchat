package com.example.chichat.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.chichat.retrofit.videorepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val videorepo : videorepo) : ViewModel() {

    val videoList = videorepo.getVideos().cachedIn(viewModelScope)

}