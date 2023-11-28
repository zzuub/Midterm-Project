package com.example.recyclerview_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.recyclerview_activity.Adapter.PerformanceAdapter

class PerformanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_performance)

        val performanceList = listOf(
            PerformanceAdapter.PerformanceData("영 웅", R.drawable.we_performance_image),
            PerformanceAdapter.PerformanceData("캣 츠", R.drawable.wee_performance_image),
            PerformanceAdapter.PerformanceData("레 베 카", R.drawable.weee_performance_image)
        )

        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val adapter = PerformanceAdapter(performanceList, object : PerformanceAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                // Item click handling
            }
        })

        viewPager.adapter = adapter
    }
}