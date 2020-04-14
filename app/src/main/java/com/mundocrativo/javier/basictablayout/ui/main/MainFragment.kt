package com.mundocrativo.javier.basictablayout.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.mundocrativo.javier.basictablayout.MyPagerAdapter
import com.mundocrativo.javier.basictablayout.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var myPagerAdapter: MyPagerAdapter
    private lateinit var viewPager: ViewPager2


    //----  https://developer.android.com/guide/navigation/navigation-swipe-view-2
    //----  Explicacion de como usar el tablayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.main_fragment, container, false)

        return view
    }

    //--- esta función no está por defecto y es la que implemeta toda la funcionalidad del paged adapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myPagerAdapter = MyPagerAdapter(this)
        viewPager = pager
        viewPager.adapter = myPagerAdapter

        TabLayoutMediator(tab_layout,viewPager){ tab, position ->
            tab.text = "TAB ${position + 1}"
        }.attach()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
