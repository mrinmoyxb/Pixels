package com.example.pixels.ViewModel

import android.app.Application
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pixels.Model.EmergencyContact.EmergencyContact
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