package com.example.myprapp.dao
import com.example.myprapp.dto.Post

interface PostDao {
    fun getAll(): List<Post>
    fun save(post : Post): Post
    fun likeById(id: Long)
    fun removeById (id: Long)
}
