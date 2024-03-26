package com.stewartmcm.tandem.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stewartmcm.tandem.data.Developer
import com.stewartmcm.tandem.network.DeveloperService
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class DeveloperListViewModel : ViewModel() {

    fun fetchDeveloperList() {
        viewModelScope.launch {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://gist.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val developerService = retrofit.create(DeveloperService::class.java)
            val response: Response<List<Developer>> = developerService.getDevelopers()
            Log.i("DeveloperListViewModel", "fetchDeveloperList: " + response.body())

        }
    }
}