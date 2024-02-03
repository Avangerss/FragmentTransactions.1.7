package com.example.lesson1kotlin3.data.models

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.lesson1kotlin3.ui.views.preferens.SharedPreferens

class ThirdViewModel: ViewModel() {
    fun saveUserData(context: Context, name: String, age: String, email: String, password: String) {
        val preferenceHelper = SharedPreferens(context)
        preferenceHelper.user_name = name
        preferenceHelper.age = age
        preferenceHelper.user_email = email
        preferenceHelper.user_password = password
    }
}