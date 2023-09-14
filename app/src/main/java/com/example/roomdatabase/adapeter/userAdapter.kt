package com.example.roomdatabase.adapeter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.database.UserDatabase
import com.example.roomdatabase.database.UserEntitiy
import com.example.roomdatabase.databinding.UserBinding
import org.w3c.dom.Entity

class userAdapter: RecyclerView.Adapter<userAdapter.UserViewHolder>() {
    lateinit var onClick: (UserEntitiy) -> Unit
    private var userList = mutableListOf<UserEntitiy>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            UserBinding.inflate(
                LayoutInflater.from(
                    parent.context

                ),parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.bind(userList[position])
    }

    override fun getItemCount(): Int = userList.size

    inner class UserViewHolder(private val binding: UserBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bind(user: UserEntitiy){
                    with(binding){
                        name.text = user.name
                        index.text  = adapterPosition.plus(1).toString()
                    }
                    itemView.setOnClickListener {
                        onClick(user)
                    }
                }
            }
    fun setList(userList: MutableList<UserEntitiy>){
        this.userList = userList
        notifyDataSetChanged()
    }

}