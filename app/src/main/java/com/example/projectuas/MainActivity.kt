package com.example.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namakotaList = listOf<karaktercoc>(
            karaktercoc(
                R.drawable.bb,
                namekaraktercoc = "Barbarian",
                desckaraktercoc = "Barbarian merupakan unit pertama kalian apabila sudah ada barak.",
                desc2karaktercoc = "Dengan penampilan seorang pria marah, ekspresi siap tempur, rambut kuning, dan kumis kuning panjang."
            ),
            karaktercoc(
                R.drawable.achr,
                namekaraktercoc = "Archer",
                desckaraktercoc = "Archer adalah unit berkisar.",
                desc2karaktercoc = "Troops ini digambarkan sebagai seorang wanita dengan rambut dan mata berwarna merah muda yang tajam, gaun hijau muda, sabuk dengan tas kecil, cincin emas di bahunya, dan bulu merah muda pada anak panahnya."
            ),
            karaktercoc(
                R.drawable.gbl,
                namekaraktercoc = "Goblin",
                desckaraktercoc = "Goblin adalah karakter tercepat dalam game ini.",
                desc2karaktercoc = "Target pertama mereka adalah bangunan sumber daya."
            ),
            karaktercoc(
                R.drawable.gnt,
                namekaraktercoc = "Giant",
                desckaraktercoc = "Giant adalah pasukan berbadan besar yang mampu memporak-porandakan lawan. ",
                desc2karaktercoc = "Troops ini akan menargetkan pertahanan musuh, sehingga dalam kelompok yang banyak, mereka dapat untuk melumpuhkan sebuah desa."
            ),
            karaktercoc(
                R.drawable.bln,
                namekaraktercoc = "Balloon",
                desckaraktercoc = "Ballon adalah sebuah Troops seperti Wall Breaker hanya Troops ini naik di dalam sebuah balon udara.",
                desc2karaktercoc = "roops ini bergerak lambat di udara. Menyerang lawan dengan cara menjatuhkan bom dari atas. Target pertama Troops ini adalah pertahanan lawan."
            ),
            karaktercoc(
                R.drawable.wzrd,
                namekaraktercoc = "Wizard",
                desckaraktercoc = "Wizard berpenampilan memakai jubah biru memakai sabuk kulit dengan gesper emas dan sepatu bot coklat.",
                desc2karaktercoc = "Serangannya dengan mengeluarkan bola api di tangan dan mengakibatkan kerusakan cukup parah namun Troops ini cukup lemah sehingga tidak susah untuk dimusnahkan."
            ),
            karaktercoc(
                R.drawable.pekka,
                namekaraktercoc = "P.E.K.K.A",
                desckaraktercoc = "P.E.K.K.A adalah pasukan dengan damage paling besar yang ada di barrack. ",
                desc2karaktercoc = "Troops ini memiliki baju besi yang sangat kuat dan dapat menimbulkan kerusakan yang parah pada pertahanan lawan."
            ),
            karaktercoc(
                R.drawable.drgn,
                namekaraktercoc = "Dragon",
                desckaraktercoc = "Dragon adalah sebuah Troops dengan mode terbang yang menakutkan dan mampu meneror unit darat dan udara lainnya. ",
                desc2karaktercoc = "Tidak seperti Troops Ballon, Dragon memiliki serangan berkisar seperti Archer."
            ),
            karaktercoc(
                R.drawable.bbkng,
                namekaraktercoc = "Barbarian King",
                desckaraktercoc = "Barbarian King adalah heroes yang memiliki badan yang lebih besar dan lebih kuat dari Barbarian.",
                desc2karaktercoc = "Heroes ini dipanggil setelah Altar Barbarian King telah dibangun dengan biaya 10.000 Dark Elixir. Barbarian King adalah unit abadi, maka hanya dapat dipanggil sekali."
            ),
            karaktercoc(
                R.drawable.achrqn,
                namekaraktercoc = "Archer Queen",
                desckaraktercoc = "Archer Queen adalah heroes yang lebih besar dan lebih kuat dari Archer.",
                desc2karaktercoc = "Dia secara otomatis dipanggil setelah Archer Queen Altar dibangun dengan biaya 40.000 Dark Elixir. Archer Queen adalah unit abadi, jadi dia hanya dapat dipanggil sekali."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kota)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = karaktercocadapter(this, namakotaList) {
            val intent = Intent(this, detail_karaktercoc::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}




