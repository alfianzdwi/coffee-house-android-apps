package com.dicoding.coffehouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity(){

    private lateinit var btnShare: Button

    //Membuat Konstanta Untuk Key
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //Menerima Data Yang Di Kirim Dari MainActivity Menggunakan Intent
        val coffeeName = intent.getStringExtra(EXTRA_NAME)
        val coffeePhoto = intent.getIntExtra(EXTRA_IMG, 0)
        val coffeePrice = intent.getIntExtra(EXTRA_PRICE, 0)
        val coffeeDetail = intent.getStringExtra(EXTRA_DETAIL)

        findViewById<TextView>(R.id.tv_item_name).text = coffeeName
        findViewById<ImageView>(R.id.img_photo).setImageResource(coffeePhoto)
        findViewById<TextView>(R.id.tv_item_price).text = coffeePrice.toString()
        findViewById<TextView>(R.id.tv_item_detail).text = coffeeDetail

        btnShare = findViewById(R.id.btn_share)

        //
        btnShare.setOnClickListener {

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, coffeeDetail)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share To :"))

        }

    }
}

