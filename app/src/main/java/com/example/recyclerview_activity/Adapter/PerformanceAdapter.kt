package com.example.recyclerview_activity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.recyclerview_activity.R

class PerformanceAdapter(private val performanceList: List<PerformanceData>, private val onItemClickListener: OnItemClickListener) : PagerAdapter() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    data class PerformanceData(val title: String, val imageResId: Int)

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(container.context)
            .inflate(R.layout.performance_item, container, false)

        val performanceImage: ImageView = view.findViewById(R.id.performanceImage)
        val performanceTitle: TextView = view.findViewById(R.id.performanceTitle)

        val performanceData = performanceList[position]
        performanceTitle.text = performanceData.title
        performanceImage.setImageResource(performanceData.imageResId)

        view.setOnClickListener {
            onItemClickListener.onItemClick(position)
        }

        container.addView(view)
        return view
    }

    override fun getCount(): Int {
        return performanceList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}