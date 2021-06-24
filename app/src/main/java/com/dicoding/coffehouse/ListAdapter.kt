package com.dicoding.coffehouse

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//Adapter Di Gunakan Untuk Menghubungkan Data2 dan Layouut recycler view ke main activity/activity
class ListAdapter (private val listCoffee: ArrayList<Coffee>): RecyclerView.Adapter<ListAdapter.MyAdapterHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_coffee, parent, false)
        return MyAdapterHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapterHolder, position: Int) {
        //Meng instance listCoffe/Data yg ada di Class Coffee
        val coffee = listCoffee[position]

        //Glide Di gunakan Untuk memuat media dari resource baik itu gambar atau yang lainnya
        Glide.with(holder.itemView.context)
            .load(coffee.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = coffee.name
        holder.tvDetail.text = coffee.detail
        holder.tvPrice.text = coffee.price.toString()

        //Membuat Fungsi Click saat itemview di click akan beralih ke activity detail
        holder.itemView.setOnClickListener{
            val context= holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)

            //Mengirim Data menggunakan Intent dan key yang sudah di buat di Detai Activity
            intent.putExtra(DetailActivity.EXTRA_NAME, coffee.name)
            intent.putExtra(DetailActivity.EXTRA_IMG, coffee.photo)
            intent.putExtra(DetailActivity.EXTRA_PRICE, coffee.price)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, coffee.detail)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = listCoffee.size

    //Mem binding nilai yg ada di variable untuk di taruh ke id yg ada di layout
    class MyAdapterHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)

    }

}


