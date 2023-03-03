package com.example.latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan1.adapter.PostAdapter
import com.example.latihan1.config.RetrofitClient
import com.example.latihan1.databinding.ActivityPostsBinding
import com.example.latihan1.responses.PostResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostsBinding
    private val list = ArrayList<PostResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPostsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getAllPosts()
    }

    private fun getAllPosts() {
        binding.rvPosts.setHasFixedSize(true)
        binding.rvPosts.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPosts().enqueue(object: Callback<ArrayList<PostResponse>> {
            override fun onResponse(
                call: Call<ArrayList<PostResponse>>,
                response: Response<ArrayList<PostResponse>>
            ) {
                val responseCode = response.code().toString()
                binding.tvStatusCode.text = responseCode
                response.body()?.let { list.addAll(it)}
                val adapter = PostAdapter(list)
                binding.rvPosts.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}