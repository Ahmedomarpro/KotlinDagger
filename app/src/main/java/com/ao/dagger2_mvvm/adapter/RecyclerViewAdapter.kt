package com.foxhole.kotlinrestapijsonplaceholder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ao.dagger2_mvvm.R
 import com.foxhole.kotlinrestapijsonplaceholder.model.User
import kotlinx.android.synthetic.main.recylerview_item.view.*

class RecyclerViewAdapter () : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>(){

    private lateinit var _userList : List<User>

    fun setUserList(userList : List<User>){
        this._userList = userList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recylerview_item, parent, false)
        return RecyclerViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return _userList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val user = _userList[position]

        holder.userIdView.text = user.id.toString()
        holder.titleView.text = user.title
        holder.bodyView.text = user.body
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userIdView : TextView = itemView.user_id
        val titleView : TextView = itemView.title
        val bodyView : TextView = itemView.body
    }
}