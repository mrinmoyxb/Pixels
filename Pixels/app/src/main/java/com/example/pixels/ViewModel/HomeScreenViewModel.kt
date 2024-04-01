package com.example.pixels.ViewModel

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class EmergencyContactViewModel: ViewModel() {

    fun openDialPad(context: Context, phoneNum: String) {
        viewModelScope.launch {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:$phoneNum"))
            context.startActivity(intent)
        }
    }

}