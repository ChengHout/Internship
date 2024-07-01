package kh.edu.rupp.ite.internship

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smarteist.autoimageslider.SliderView
import kh.edu.rupp.ite.internship.adapter.SliderAdapter
import kh.edu.rupp.ite.internship.databinding.ActivityEvenDetailBinding

class EvenDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEvenDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEvenDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtLocation.setOnClickListener {
            startActivity(Intent(this, LocationListActivity::class.java))
        }
        binding.btnBack.setOnClickListener {
            finish()
        }

        val sliderView = binding.sliderView
        val sliderViewImageUrl = listOf(
            "https://instagram.fpnh10-1.fna.fbcdn.net/v/t39.30808-6/422828973_696219772598059_900377789001384656_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4yMDQ4eDIwNDguc2RyLmYzMDgwOCJ9&_nc_ht=instagram.fpnh10-1.fna.fbcdn.net&_nc_cat=107&_nc_ohc=IFz-PI2LzeAQ7kNvgGdNINB&edm=ALQROFkAAAAA&ccb=7-5&ig_cache_key=MzI4Nzk3MjEwODc2MjM1NDg3OA%3D%3D.2-ccb7-5&oh=00_AYBiMyKV1ZoAHBviv1RHLi-XCfEso60sh5ECMOwWiTjZcw&oe=66842064&_nc_sid=fc8dfb",
            "https://media-cdn.tripadvisor.com/media/photo-s/25/20/c7/1e/koi-the-cambodia.jpg",
        )

        val adapter = SliderAdapter(sliderViewImageUrl)
        sliderView.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR
        sliderView.setSliderAdapter(adapter)
        sliderView.isAutoCycle = true
        sliderView.startAutoCycle()
    }
}