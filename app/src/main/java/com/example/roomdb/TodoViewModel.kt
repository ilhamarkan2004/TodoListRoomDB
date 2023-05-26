package com.example.roomDB

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.roomdb.database.Todo

import com.example.roomdb.database.TodoDAO
import com.example.roomdb.database.TodoDatabase
import com.example.roomdb.database.TodoRepository

class TodoViewModel(application : Application) : AndroidViewModel(application) {
    //add repository

    private val repoitory : TodoRepository
    private val todoDAO : TodoDAO

    private var _todos : LiveData<List<Todo>>

    val todos: LiveData<List<Todo>>
        get() = _todos

    init {
//        _todos.value = arrayListOf(Todo(1, "mandi"), Todo(2, "bangun"))

        //getInstance disesuaikan pada TodoDatabase
        todoDAO = TodoDatabase.getInstance(application).todoDAO()
        repoitory = TodoRepository(todoDAO)
        _todos = repoitory.allTodos
    }
    fun addTodo(text : String){
//        val newId = _todos.value!!.size+1


//        erorrr
//        _todos.value!!.add(Todo(3,text))
//        todos.postValue(_todos.value)

//
//        val currentList = _todos.value ?: arrayListOf()
//        currentList.add(Todo(newId, text))
//        _todos.postValue(currentList)
    }
    fun removeTodo(pos : Int){
        //erorr
//        _todos.value!!.removeAt(pos)
//        todos.setValue(_todos.value)


//        val currentList = _todos.value ?: return
//        if (pos >= 0 && pos < currentList.size) {
//            currentList.removeAt(pos)
//            _todos.postValue(currentList)
//        }
    }
    fun updateTodo(pos : Int, text : String){
        //        erorrr
//        _todos.value!![pos].task = text
//        todos.setValue(_todos.value)

//
//        val currentList = _todos.value ?: return
//        if (pos >= 0 && pos < currentList.size) {
//            currentList[pos].task = text
//            _todos.postValue(currentList)
        }
    }
