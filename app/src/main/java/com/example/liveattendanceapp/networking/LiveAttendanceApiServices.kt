package com.example.liveattendanceapp.networking

import com.example.liveattendanceapp.model.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface LiveAttendanceApiServices {

    @Headers("Accept: application/json", "Content-Type: application/json")
    @POST("auth/login")
    fun loginRequest(@Body body: String): Call<LoginResponse>
}