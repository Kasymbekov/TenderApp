package com.example.tenderapp.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUp2ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        //value = ""
    }
    val text: LiveData<String> = _text
}