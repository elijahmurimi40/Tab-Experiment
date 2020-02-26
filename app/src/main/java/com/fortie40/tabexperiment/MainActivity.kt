package com.fortie40.tabexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortie40.tabexperiment.pageradapters.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val DEFAULT_PAGE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // set text for each tab
        tab_layout.addTab(tab_layout.newTab().setText("Camera"))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.tab_label1))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.tab_label2))
        tab_layout.addTab(tab_layout.newTab().setText(R.string.tab_label3))

        // tabs to fill entire layout
        tab_layout.tabGravity = TabLayout.GRAVITY_FILL

        // PagerAdapter to manage page views in fragments
        val pagerAdapter = PagerAdapter(supportFragmentManager, tab_layout.tabCount)
        pager.adapter = pagerAdapter
        pager.currentItem = DEFAULT_PAGE

        // Setting a listener for clicks
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                pager.currentItem = tab!!.position
            }
        })
    }
}
