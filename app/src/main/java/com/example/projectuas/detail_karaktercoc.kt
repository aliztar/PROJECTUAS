package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_karaktercoc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_karaktercoc)

        supportActionBar?.title = "Biodata Lengkap Karakter coc"

        val namakota = intent.getParcelableExtra<karaktercoc>(MainActivity.INTENT_PARCELABLE)

        val imgkaraktercoc = findViewById<ImageView>(R.id.img_item_photo)
        val namekaraktercoc = findViewById<TextView>(R.id.tv_item_name)
        val desckaraktercoc = findViewById<TextView>(R.id.tv_item_description)
        val desc2karaktercoc = findViewById<TextView>(R.id.tv_item_description2)

        imgkaraktercoc.setImageResource(namakota?.imgkaraktercoc!!)
        namekaraktercoc.text = namakota.namekaraktercoc
        desckaraktercoc.text = namakota.desckaraktercoc
        desc2karaktercoc.text = namakota.desc2karaktercoc
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}