package com.sugyeong.test4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.R
import com.sugyeong.test4.bean.InstagramBean


class InstagramAdapter(list:ArrayList<InstagramBean>):RecyclerView.Adapter<InstagramAdapter.InstagramHolder>(){
    private var mList:ArrayList<InstagramBean>?=null
    init{
        mList = list
    }

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):InstagramHolder{
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list_item_instagram,parent,false)
        return InstagramHolder(v)
    }
    override fun getItemCount():Int{
        return mList!!.size
    }
    override fun onBindViewHolder(holder:InstagramHolder,position:Int){
        var item = mList?.get(position)

        holder.userImg.setBackgroundResource( item!!.userImg!!)
        holder.userName.setText(item!!.userName!!)
        holder.photoImg.setBackgroundResource(item!!.photoImg!!)
        holder.like.setText(item!!.like!!)

    }
    class InstagramHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        public var mView:View
        public var userImg:ImageView
        public var userName : TextView
        public var photoImg : ImageView
        public var like : TextView

        init{
            mView = itemView
            userImg = mView.findViewById(R.id.userImg)
            userName = mView.findViewById(R.id.userName)
            photoImg = mView.findViewById(R.id.photoImg)
            like = mView.findViewById(R.id.like)

        }
    }
}