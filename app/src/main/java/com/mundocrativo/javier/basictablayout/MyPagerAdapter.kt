package com.mundocrativo.javier.basictablayout

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mundocrativo.javier.basictablayout.ui.fragment1.Fragment1
import com.mundocrativo.javier.basictablayout.ui.fragment2.Fragment2
import com.mundocrativo.javier.basictablayout.ui.main.MainFragment

class MyPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment1()
            else -> Fragment1()
        }
        return fragment
    }
}