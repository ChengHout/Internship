package kh.edu.rupp.ite.internship

import android.content.Intent
import android.os.Bundle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kh.edu.rupp.ite.internship.adapter.SliderAdapter
import kh.edu.rupp.ite.internship.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtView.setOnClickListener {
            startActivity(Intent(activity, EvenDetailActivity::class.java))
        }

        //SliderView
        val sliderView = binding.sliderView
        val sliderViewImageUrl = listOf(
            "https://www.khmertimeskh.com/wp-content/uploads/2023/05/2.jpg",
            "https://pppenglish.sgp1.digitaloceanspaces.com/image/main/field/image/koi-cafe.jpg",
        )

        val adapter = SliderAdapter(sliderViewImageUrl)
        sliderView.setSliderAdapter(adapter)
        sliderView.isAutoCycle = true
        sliderView.startAutoCycle()

        // load image announcement url
        Glide.with(this)
            .load("https://onecard.com.my/Files/FoodReview/LG329_k3lxhqx4.jpg")
            .into(binding.imgAnnouncement)
    }
}