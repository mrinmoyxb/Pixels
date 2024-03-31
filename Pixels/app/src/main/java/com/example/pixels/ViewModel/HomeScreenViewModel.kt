package com.example.pixels.ViewModel

import android.app.Application
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.pixels.Model.EmergencyContact.EmergencyContact

class EmergencyContactViewModel: ViewModel() {

    //val context = LocalContext
    fun openDialPad(context: Context, phoneNum: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:$phoneNum"))
        context.startActivity(intent)
    }



//    private val _emergencyContacts = mutableListOf<EmergencyContact>()
//    val emergencyContacts: List<EmergencyContact>
//        get() = _emergencyContacts.toList() // Return immutable copy
//
//    fun addEmergencyContact(name: String, number: String) {
//        _emergencyContacts.add(EmergencyContact(name, number))
//    }
//
//    fun dialEmergencyNumber(context: Context, position: Int) {
//        val intent = Intent(Intent.ACTION_DIAL).apply {
//            data = Uri.parse("tel:${emergencyContacts[position].number}")
//            flags = Intent.FLAG_ACTIVITY_NEW_TASK
//        }
//
//        // Check for dial intent availability before starting activity (safety)
//        if (intent.resolveActivity(context.packageManager) != null) {
//            context.startActivity(intent)
//        } else {
//            Toast.makeText(context, "Dial Intent Not Found", Toast.LENGTH_SHORT).show()
//        }
//    }
}