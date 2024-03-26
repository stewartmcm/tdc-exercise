package com.stewartmcm.tandem.network

import com.google.gson.JsonArray
import com.stewartmcm.tandem.data.Developer
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DeveloperService {

    @GET("russellbstephens/41e3b81879cf096212fc9834be0407b5/raw/388971ddd9fd1b099e829de233526eb345a1ad37/people.json")
    suspend fun getDevelopers(): Response<List<Developer>>
}