package com.example.todo.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://jsonplaceholder.typicode.com/"

interface ToDosApi {
    @GET("todos")
    suspend fun getTodos(): List<ToDo>

    companion object {
        var toDoService: ToDosApi? = null

        fun getInstance(): ToDosApi {
            if (toDoService === null) {
                toDoService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ToDosApi::class.java)
            }
            return toDoService!!
        }
    }
}

