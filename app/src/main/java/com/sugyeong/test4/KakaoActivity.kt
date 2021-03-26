package com.sugyeong.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sugyeong.test4.adapter.KakaoBankAdapter
import com.sugyeong.test4.bean.KakaoBankBean
import kotlinx.android.synthetic.main.activity_kakao.*

class KakaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kakao)

        var kakaoBankBean1 = KakaoBankBean()
        kakaoBankBean1.name = "홍길동의 통장"
        kakaoBankBean1.type = "입출금"
        kakaoBankBean1.bankNumber = "1111-1111-111111"
        kakaoBankBean1.money = "9,999,999원"

        var kakaoBankBean2 = KakaoBankBean()
        kakaoBankBean2.name = "홍길동의 통장2"
        kakaoBankBean2.type = "입출금2"
        kakaoBankBean2.bankNumber = "1111-1111-1111112"
        kakaoBankBean2.money = "29,999,999원"

        var data = ArrayList<KakaoBankBean>()
        data.add(kakaoBankBean1)
        data.add(kakaoBankBean2)

        var recyclerView_kakako = findViewById<RecyclerView>(R.id.recyclerView_kakako)
        var layoutManagaer
                = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        recyclerView_kakako?.setLayoutManager(layoutManagaer)

        var myAdapter = KakaoBankAdapter(data)
        recyclerView_kakako.adapter = myAdapter


        instagram.setOnClickListener(View.OnClickListener {
            var i = Intent(this@KakaoActivity, InstagramActivity::class.java)
            startActivity(i)
        })

    }
}