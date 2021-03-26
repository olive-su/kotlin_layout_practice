package com.sugyeong.test4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.R
import com.sugyeong.test4.bean.KakaoBankBean


class KakaoBankAdapter(list:ArrayList<KakaoBankBean>):RecyclerView.Adapter<KakaoBankAdapter.KakaoBankHolder>(){
    private var mList:ArrayList<KakaoBankBean>?=null
    init{
        mList = list
    }

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):KakaoBankHolder{
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list_item_kakaobank,parent,false)
        return KakaoBankHolder(v)
    }
    override fun getItemCount():Int{
        return mList!!.size
    }
    override fun onBindViewHolder(holder:KakaoBankHolder,position:Int){
        var item = mList?.get(position)

        if(position == 0){
            holder.bgLayout.setBackgroundResource(R.drawable.round)

        } else {
            holder.bgLayout.setBackgroundResource(R.drawable.round2)

        }

        holder.name.setText( item!!.name)
        holder.type.setText( item!!.type)
        holder.bankNumber.setText( item!!.bankNumber)
        holder.money.setText(item!!.money)



    }
    class KakaoBankHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        public var mView:View
        public var bgLayout:LinearLayout
        public var name : TextView
        public var type : TextView
        public var bankNumber : TextView
        public var money : TextView

        init{
            mView = itemView
            bgLayout = mView.findViewById(R.id.bgLayout)
            name = mView.findViewById(R.id.name)
            type = mView.findViewById(R.id.type)
            bankNumber = mView.findViewById(R.id.bankNumber)
            money = mView.findViewById(R.id.money)

        }
    }
}