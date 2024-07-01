package kh.edu.rupp.ite.internship

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.ite.internship.adapter.LocationListAdapter
import kh.edu.rupp.ite.internship.databinding.ActivityLocationListBinding
import kh.edu.rupp.ite.internship.model.Location

class LocationListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocationListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtCancel.setOnClickListener {
            finish()
        }

        val adapter = LocationListAdapter()
        binding.recyclerView.adapter = adapter
        adapter.submitList(data)
    }
}

private val data = listOf(
//    Location(
//        locationName = "KOI The IFL",
//        location = "120B Russian Confederation Blvd Teuk La'ork II Toul Kork",
//        distance = "1.81km",
//        openHour = "01:00 AM - 11:59 PM",
//        isBusy = false,
//        imgUrl = "https://fastly.4sqi.net/img/general/600x600/43345281_RxJncrKiqeo6DTf7NG6gwC4DoRuvc_gME3fh4pSYpZA.jpg"
//    )
    listOf(
        "KOI The IFL",
        "120B Russian Confederation Blvd Teuk La'ork II Toul Kork",
        "01:00 AM - 11:59 PM",
        "1.81km",
        "false",
        "https://fastly.4sqi.net/img/general/600x600/43345281_RxJncrKiqeo6DTf7NG6gwC4DoRuvc_gME3fh4pSYpZA.jpg"
    ),
    listOf(
        "KOI The MIDTOWN",
        "Midtown Community Mall 88 Street 2004",
        "08:00 AM - 9:00 PM",
        "3.93km",
        "false",
        "https://www.foodbuzz.site/wp-content/uploads/2019/06/Midtown-Community-Mall-1-1000x563.jpg"
    ),
    listOf(
        "KOI The PREAH NORODOM",
        "158 Preah Norodom Blvd Tonle Bassac, Chamkarmon",
        "08:00 AM - 10:00 PM",
        "5.56km",
        "false",
        "https://www.khmertimeskh.com/wp-content/uploads/2021/11/IMG_1676.jpg"
    ),
    listOf(
        "KOI The PRINCE MALL",
        "120B Russian Confederation Blvd Teuk La'ork II Toul Kork",
        "01:00 AM - 11:59 PM",
        "185.42km",
        "false",
        "https://www.centrepoint.co.id/sites/default/files/styles/hero_image_small/public/2019-03/koi_header.jpg?itok=HPFgmF_d"
    ),
    listOf(
        "KOI The MIDTOWN",
        "Midtown Community Mall 88 Street 2004",
        "08:00 AM - 9:00 PM",
        "3.93km",
        "true",
        "https://www.khmertimeskh.com/wp-content/uploads/2021/11/IMG_1676.jpg"
    ),
    listOf(
        "KOI The PREAH NORODOM",
        "158 Preah Norodom Blvd Tonle Bassac, Chamkarmon",
        "08:00 AM - 10:00 PM",
        "5.56km",
        "true",
        "https://fastly.4sqi.net/img/general/600x600/43345281_RxJncrKiqeo6DTf7NG6gwC4DoRuvc_gME3fh4pSYpZA.jpg"
    ),
    listOf(
        "KOI The IFL",
        "120B Russian Confederation Blvd Teuk La'ork II Toul Kork",
        "01:00 AM - 11:59 PM",
        "1.81km",
        "false",
        "https://www.khmertimeskh.com/wp-content/uploads/2021/11/IMG_1676.jpg"
    )
)