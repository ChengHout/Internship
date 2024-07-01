package kh.edu.rupp.ite.internship

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kh.edu.rupp.ite.internship.databinding.ActivityLandingBinding

class LandingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showFragment(HomeFragment())
    }

    private fun showFragment(fragment: Fragment) {
        // fragment manager
        val fragmentManager: FragmentManager = supportFragmentManager
        // fragment transaction
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        // replace fragment in lytFragment
        fragmentTransaction.replace(R.id.lytFragment, fragment)
        fragmentTransaction.commit()
    }

}