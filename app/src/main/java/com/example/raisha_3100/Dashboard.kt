package com.example.raisha_3100

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard)

        val dataList = arrayListOf(
            Mahasiswa("Raisha", "24.12.3100"),
            Mahasiswa("Nasylla", "24.12.3105"),
            Mahasiswa("Intan", "24.12.3108"),
            Mahasiswa("Sasa", "24.12.3112"),
            Mahasiswa("Ilham", "24.12.3191"),
            Mahasiswa("Ilham", "24.12.3191")
        )

        // 2. Inisialisasi RecyclerView
        val rv_mahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)

        // 3. Atur LayoutManager
        rv_mahasiswa.layoutManager = GridLayoutManager(this, 2)

        // 4. Inisialisasi Adapter
        val adapter = MahasiswaAdapter(dataList)

        // 5. Set Adapter ke RecyclerView
        rv_mahasiswa.adapter = adapter
    }
}