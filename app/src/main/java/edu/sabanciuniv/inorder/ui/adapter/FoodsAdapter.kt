package edu.sabanciuniv.inorder.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import edu.sabanciuniv.inorder.R
import edu.sabanciuniv.inorder.data.entity.Foods
import edu.sabanciuniv.inorder.databinding.ItemFoodsBinding
import edu.sabanciuniv.inorder.ui.viewmodel.HomeViewModel

class FoodsAdapter(private val yemekList: List<Foods>) : RecyclerView.Adapter<FoodsAdapter.YemekViewHolder>() {

    inner class YemekViewHolder(val binding: ItemFoodsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekViewHolder {
        val binding = ItemFoodsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return YemekViewHolder(binding)
    }

    override fun onBindViewHolder(holder: YemekViewHolder, position: Int) {
        val yemek = yemekList[position]
        holder.binding.apply {
            foodName.text = yemek.food_name
            foodPrice.text = yemek.food_price.toString()
            Glide.with(foodImage.context)
                .load("http://kasimadalan.pe.hu/yemekler/resimler/${yemek.food_image_name}")
                .into(foodImage)
        }
    }

    override fun getItemCount() = yemekList.size
}