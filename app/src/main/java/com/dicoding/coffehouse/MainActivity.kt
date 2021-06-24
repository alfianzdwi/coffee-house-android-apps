package com.dicoding.coffehouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //Menginisialisasi Variable Secara Global
    private lateinit var rvCoffee: RecyclerView
    private var list: ArrayList<Coffee> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Melakukan Binding Atau Menaruh Nilai dari variable ke id yg ada di layout
        rvCoffee = findViewById(R.id.rv_coffee)


        rvCoffee.setHasFixedSize(true)
        list.addAll(CoffeeData.listData)

        //Memanggil Fungsi
        showRecycler()
    }

    //Membuat Fungsi showRecycler Di dalam nya Untuk memilih layoutManager dan menghubungkan dengan adapter yang sudah di buat
    private fun showRecycler(){
        rvCoffee.layoutManager = LinearLayoutManager(this)
        val myAdapter = ListAdapter(list)
        rvCoffee.adapter = myAdapter
    }

    //
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    //Untuk Melakukan Action Saat Menu Di Click
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                val moveProfile = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveProfile)
            }

        }
    }
}