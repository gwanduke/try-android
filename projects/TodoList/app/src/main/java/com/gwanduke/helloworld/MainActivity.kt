package com.gwanduke.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

// 앱의 한 스크린을 Activity 라 한다.
class MainActivity : AppCompatActivity() {
    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoTitle.text.toString()
            if (todoTitle.isNotEmpty()) {
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTitle.text.clear()
            }
        }
        btnDeleteTodo.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}