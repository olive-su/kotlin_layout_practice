package com.sugyeong.test4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.R
import com.sugyeong.test4.bean.YoutubeBean


class YoutubleAdapter(list:ArrayList<YoutubeBean>):RecyclerView.Adapter<YoutubleAdapter.YouTubleHolder>(){
    private var mList:ArrayList<YoutubeBean>?=null
    init{
        mList=list
    }

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):YouTubleHolder{
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list_item_youtuble,parent,false)
        return YouTubleHolder(v)
    }
    override fun getItemCount():Int{
        return mList!!.size
    }
    override fun onBindViewHolder(holder:YouTubleHolder,position:Int){
        var item = mList?.get(position)

        holder.mainImg.setBackgroundResource(item!!.mainImg!!)
        holder.mainTitle.setText(item!!.mainTitle!!)
        holder.userImg.setBackgroundResource(item!!.userImg!!)
        holder.date.setText(item!!.userName!! + " " + item!!.count + " " + item!!.date  )


    }
    class YouTubleHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        public var mView:View
        public var mainImg : ImageView
        public var userImg : ImageView
        public var mainTitle : TextView
        public var date : TextView

        init{
            mView = itemView
            mainImg = mView.findViewById(R.id.mainImg)
            userImg = mView.findViewById(R.id.userImg)
            mainTitle = mView.findViewById(R.id.mainTitle)
            date = mView.findViewById(R.id.date)

        }
    }
}