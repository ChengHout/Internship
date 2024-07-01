package kh.edu.rupp.ite.internship.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter
import kh.edu.rupp.ite.internship.databinding.SlideImageViewHolderBinding

class SliderAdapter(private val sliderList: List<String>) :
    SliderViewAdapter<SliderAdapter.SliderViewHolder>() {

    class SliderViewHolder(itemBinding: SlideImageViewHolderBinding) :
        ViewHolder(itemBinding.root) {
        val imageView = itemBinding.slideImage
    }

    override fun getCount(): Int {
        return sliderList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val binding = SlideImageViewHolderBinding.inflate(layoutInflater, parent, false)
        return SliderViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: SliderViewHolder?, position: Int) {
        Glide.with(viewHolder!!.imageView).load(sliderList[position]).fitCenter()
            .into(viewHolder.imageView)
    }
}