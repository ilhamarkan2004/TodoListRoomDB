package com.example.roomDB

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import com.example.roomdb.Todo

class TodoViewModel : ViewModel() {
    private val _todos = MutableLiveData<ArrayList<Todo>>()

    val todos: LiveData<ArrayList<Todo>>
        get() = _todos

    init {
        _todos.value = arrayListOf(Todo(1, "mandi"), Todo(2, "bangun"))
    }
    fun addTodo(text : String){
        val newId = _todos.value!!.size+1
//        erorrr
//        _todos.value!!.add(Todo(3,text))
//        todos.postValue(_todos.value)
        val currentList = _todos.value ?: arrayListOf()
        currentList.add(Todo(newId, text))
        _todos.postValue(currentList)
    }
    fun removeTodo(pos : Int){
        //erorr
//        _todos.value!!.removeAt(pos)
//        todos.setValue(_todos.value)
        val currentList = _todos.value ?: return
        if (pos >= 0 && pos < currentList.size) {
            currentList.removeAt(pos)
            _todos.postValue(currentList)
        }
    }
    fun updateTodo(pos : Int, text : String){
        //        erorrr
//        _todos.value!![pos].task = text
//        todos.setValue(_todos.value)
        val currentList = _todos.value ?: return
        if (pos >= 0 && pos < currentList.size) {
            currentList[pos].task = text
            _todos.postValue(currentList)
        }
    }
}
