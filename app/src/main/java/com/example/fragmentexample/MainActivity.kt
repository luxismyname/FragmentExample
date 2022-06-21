package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.fragmentexample.adapter.FragmentAdapter
import com.example.fragmentexample.adapter.MyViewPagerAdapter
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val tabLayout: TabLayout = findViewById(R.id.tab1)

//        viewPager2.adapter = MyViewPagerAdapter(this) //only viewpager
        viewPager2.adapter = FragmentAdapter(supportFragmentManager, lifecycle)
//        TabLayoutMediator(tabLayout, viewPager2, TabLayoutMediator.TabConfigurationStrategy({tab, position ->  })).attach()

        TabLayoutMediator(tabLayout, viewPager2, TabLayoutMediator.TabConfigurationStrategy({tab, position ->
            when(position){
                0 -> {
                    tab.text = "1"
                }
                1 -> {
                    tab.text = "2"
                }
            }
        })).attach()

    }
}