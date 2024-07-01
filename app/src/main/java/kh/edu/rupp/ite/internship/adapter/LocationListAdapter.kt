package kh.edu.rupp.ite.internship.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import kh.edu.rupp.ite.internship.databinding.LocationItemBinding

class LocationListAdapter : ListAdapter<List<String>, LocationListAdapter.LocationListViewHolder>(
    object : DiffUtil.ItemCallback<List<String>>() {
        override fun areItemsTheSame(oldItem: List<String>, newItem: List<String>): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: List<String>, newItem: List<String>): Boolean {
            return oldItem == newItem
        }

    }
) {

    class LocationListViewHolder(private val itemBinding: LocationItemBinding) :
        ViewHolder(itemBinding.root) {
        fun bind(
            branch: String,
            location: String,
            date: String,
            distance: String,
            isBusy: String,
            imageUrl: String
        ) {
            itemBinding.txtBranch.text = branch
            itemBinding.txtLocation.text = location
            itemBinding.date.text = date
            itemBinding.distance.text = distance
            Glide.with(itemBinding.imgCard).load(imageUrl).into(itemBinding.imgCard)
            if (isBusy.toBoolean()) {
                itemBinding.isBusy.visibility = View.VISIBLE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LocationItemBinding.inflate(layoutInflater, parent, false)
        return LocationListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationListViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item[0], item[1], item[2], item[3], item[4], item[5])
    }
}