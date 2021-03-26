package com.sugyeong.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.adapter.InstagramAdapter
import com.sugyeong.test4.bean.InstagramBean

class InstagramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)


        var instagramBean1 = InstagramBean()
        instagramBean1.userName = "홍길동"
        instagramBean1.userImg = R.drawable.youtube_user_1
        instagramBean1.photoImg = R.drawable.img_content
        instagramBean1.like = "1,999 좋아요"

        var instagramBean2 = InstagramBean()
        instagramBean2.userName = "홍길동2"
        instagramBean2.userImg = R.drawable.youtube_user_2
        instagramBean2.photoImg = R.drawable.img_content
        instagramBean2.like = "11,999 좋아요"

        var data = ArrayList<InstagramBean>()
        data.add(instagramBean1)
        data.add(instagramBean2)

        var recyclerView_kakako = findViewById<RecyclerView>(R.id.recyclerView_instagram)
        var layoutManagaer
                = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        recyclerView_kakako?.setLayoutManager(layoutManagaer)

        var myAdapter = InstagramAdapter(data)
        recyclerView_kakako.adapter = myAdapter


    }
}