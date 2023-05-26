package com.example.roomdb.database

class TodoRepository(private val TodoDAO : TodoDAO){
    val allTodos = TodoDAO.loadTodos()

    fun insert(todo: Todo){
        TodoDAO.insertTodo(todo)
    }
}