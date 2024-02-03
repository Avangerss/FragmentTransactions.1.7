package com.example.lesson1kotlin3.data.models

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson1kotlin3.ui.views.preferens.SharedPreferens

class RegistreaionViewModel: ViewModel() {
    fun saveUserData(context: Context, name: String, age: String, email: String, password: String, showReg: Boolean) {
        val preferenceHelper = SharedPreferens(context)
        preferenceHelper.user_name = name
        preferenceHelper.age = age
        preferenceHelper.user_email = email
        preferenceHelper.user_password = password
        preferenceHelper.isShowRegister = showReg
    }
}
