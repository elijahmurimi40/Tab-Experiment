package com.fortie40.tabexperiment.ui.tabfragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.fortie40.tabexperiment.R

/**
 * A simple [Fragment] subclass.
 */
class TabFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

}