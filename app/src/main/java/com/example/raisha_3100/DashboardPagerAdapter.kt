package com.example.raisha_3100

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DashboardPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2  // jumlah tab

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BeritaFragment()
            else -> PengumumanFragment()
        }
    }
}
