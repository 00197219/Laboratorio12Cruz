package com.example.laboratorio11.network.dto.login

import com.google.gson.annotations.SerializedName


class LoginResponse (
    @SerializedName("msg") val message: String,
    @SerializedName("token") val token: String,
        )