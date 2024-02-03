package com.example.lesson1kotlin3.data.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson1kotlin3.ui.views.preferens.SharedPreferens

class MainViewModel : ViewModel() {
    private var _userData = MutableLiveData<UserModel>()
    val userData: LiveData<UserModel> = _userData

    fun updateUserModel(userModel: UserModel) {
        _userData.value = userModel
    }
}