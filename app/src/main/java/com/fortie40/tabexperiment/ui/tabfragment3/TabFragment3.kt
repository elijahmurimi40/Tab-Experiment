package com.fortie40.tabexperiment.ui.tabfragment3

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.fortie40.tabexperiment.R

/**
 * A simple [Fragment] subclass.
 */
class TabFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab3, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.tab_fragment3_menu, menu)
    }

}
