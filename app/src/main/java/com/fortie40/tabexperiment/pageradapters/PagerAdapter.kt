package com.fortie40.tabexperiment.pageradapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.fortie40.tabexperiment.ui.camerafragment.CameraFragment
import com.fortie40.tabexperiment.ui.tabfragment1.TabFragment1
import com.fortie40.tabexperiment.ui.tabfragment2.TabFragment2
import com.fortie40.tabexperiment.ui.tabfragment3.TabFragment3

class PagerAdapter(fm: FragmentManager, numOfTabs: Int) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var mNumOfTabs = numOfTabs

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> CameraFragment()
            1 -> TabFragment1()
            2 -> TabFragment2()
            3 -> TabFragment3()
            else -> TabFragment1()
        }
    }

    override fun getCount(): Int {
        return mNumOfTabs
    }
}