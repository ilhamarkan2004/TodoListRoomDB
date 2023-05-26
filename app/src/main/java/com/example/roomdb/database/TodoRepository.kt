package com.example.roomdb.database

class TodoRepository(private val TodoDAO : TodoDAO){
    val allTodos = TodoDAO.loadTodos()
}