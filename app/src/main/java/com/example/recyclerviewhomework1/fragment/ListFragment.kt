package com.example.recyclerviewhomework1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewhomework1.R
import com.example.recyclerviewhomework1.adapter.PostAdapter
import com.example.recyclerviewhomework1.model.Post
import kotlinx.android.synthetic.main.fragment_list.view.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root = inflater.inflate(R.layout.fragment_list, container, false)

        var postArray = ArrayList<Post>()
        postArray.add(Post("Kathy", R.drawable.profile, "2K", "98", "69"))
        postArray.add(Post("Thomas", R.drawable.profile, "1K", "28", "39"))
        postArray.add(Post("James", R.drawable.profile, "4K", "228", "1K"))

        var postAdapter = PostAdapter(postArray)

        root.recyclerView.layoutManager = LinearLayoutManager(context)
        root.recyclerView.adapter = postAdapter
        // Inflate the layout for this fragment
        return root
    }

}
