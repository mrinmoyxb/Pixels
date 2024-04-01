package com.example.pixels.ViewModel.PrescriptionScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pixels.Model.Database.PrescriptionsDao
import com.example.pixels.Model.Database.PrescriptionsTable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class PrescriptionViewModel(private val prescriptionDao: PrescriptionsDao): ViewModel() {

    fun addEarningTransaction(heading: String, doctorDigitalSignature: String, clinicalFindings: String,
                              medicine: String, advice: String, formattedDate: String, dateAddedInMillis: Long){
        viewModelScope.launch{
            prescriptionDao.inputPrescription(PrescriptionsTable(heading = heading, doctorDigitalSignature = doctorDigitalSignature,
                clinicalFindings = clinicalFindings, medicine = medicine, advice = advice, formattedDate = formattedDate, dateAddedInMillis = dateAddedInMillis))
        }
    }

    var getAllPrescriptions: Flow<List<PrescriptionsTable>> = prescriptionDao.getAllPrescriptions()


}