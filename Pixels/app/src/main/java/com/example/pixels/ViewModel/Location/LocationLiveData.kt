package com.example.pixels.ViewModel.Location

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationRequest
import androidx.core.app.ActivityCompat
import androidx.databinding.tool.store.Location
import androidx.lifecycle.LiveData
import com.example.pixels.Model.Location.LocationDetails
import com.google.android.gms.location.LocationServices

class LocationLiveData(var context: Context): LiveData<LocationDetails>() {

    private val fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

    // At least there is one observer
    override fun onActive(){
        super.onActive()
        if (ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        fusedLocationClient.lastLocation.addOnSuccessListener {
            location -> location.also{
                setLocationData(it)
        }
        }
        startLocationUpdates()
    }

    private fun startLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(locationRequest)
    }

    private fun setLocationData(location: Location?) {
        location?.let {
            location ->
            value = LocationDetails(location.latitude.toString(), location.longitude.toString())
        }
    }

    // no one is looking at
    override fun onInactive() {
        super.onInactive()
    }

    companion object {
        val ONE_MINUTE:Long = 6000
        val locationRequest: LocationRequest = LocationRequest.create().apply{
            
        }

    }
}