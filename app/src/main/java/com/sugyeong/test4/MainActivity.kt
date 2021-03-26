package com.sugyeong.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.adapter.YoutubleAdapter
import com.sugyeong.test4.bean.YoutubeBean
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var youtubeBean1 = YoutubeBean()
        youtubeBean1.mainImg = R.drawable.youtube_image
        youtubeBean1.mainTitle = "(대박) 시중에선 취급 불가(!) 귀한 생선 '긴꼬리 벵에돔' 냉장고를 부탁해 161회"
        youtubeBean1.userImg = R.drawable.youtube_user_1
        youtubeBean1.userName = "JTBC Ent."
        youtubeBean1.count = "조회수 49만회"
        youtubeBean1.date = "2년전"

        var youtubeBean2 = YoutubeBean()
        youtubeBean2.mainImg = R.drawable.youtube_image_2
        youtubeBean2.mainTitle = "속였다 생각 했습는데...'임자 만난' 보이스피싱범(2020.09.17/뉴스데스크/MBC)"
        youtubeBean2.userImg = R.drawable.youtube_user_2
        youtubeBean2.userName = "MBCNEWS"
        youtubeBean2.count = "조회수 62만회"
        youtubeBean2.date = "1일전"

        var data = ArrayList<YoutubeBean>()
        data.add(youtubeBean1)
        data.add(youtubeBean2)

        var recyclerView_youtube = findViewById<RecyclerView>(R.id.recyclerView_youtube)
        var layoutManagaer
        = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        recyclerView_youtube?.setLayoutManager(layoutManagaer)

        var myAdapter = YoutubleAdapter(data)
        recyclerView_youtube.adapter = myAdapter


        kakaoBank.setOnClickListener(View.OnClickListener {
            var i = Intent(this@MainActivity, KakaoActivity::class.java)
            startActivity(i)
        })












    }
}