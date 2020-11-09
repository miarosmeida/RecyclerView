package com.example.ppb1_201804008_05

object DataSekolah {
    private val namaSekolah = arrayOf(
        "SMKN 2 PURWAKARTA", "SMKN 3 LINGGABUANA ", "SMKN 1 SUKATANI", "SMKN 3 SUKATANI", "SMKN DARANGDAN",
        "SMKN 1 PLERED", "SMKN 1 PURWAKARTA", "SMKN 1 SUBANG", "SMKN 2 SUBANG", "SMKN 1 CIBOGO","SMKN 1 MAJALAYA",
        "SMKPGRISUBANG", "SMKN2BANDUNG", "SMKN4BANDUNG"

    )
    private val kecSekolah = arrayOf(
        "Purwakarta", "Purwakarta", "Sukatani","Sukatani", "Darangdan", "Plered",
        "BabakanCikao", "Subang", "Dawuan", "Cibogo", "Majalaya", "Subang", "BandungWetan","Lengkong"
    )
    private val logoSekolah = arrayOf(
        R.drawable.smkn2purwakarta, R.drawable.smkn3linggabuana, R.drawable.smkn1sukatani, R.drawable.smkn3sukatani,
        R.drawable.smkndarangdan, R.drawable.smkn1plered, R.drawable.smkn1purwakarta, R.drawable.smkn1subang,
        R.drawable.smkn2subang, R.drawable.smkn1cibogo, R.drawable.smkn1majalaya, R.drawable.smkpgri,
        R.drawable.smkn2bandung, R.drawable.smkn4bandung
    )
    val listData: ArrayList<Sekolah>
        get() {
            val listSekolah = arrayListOf<Sekolah>()
            for (position in namaSekolah.indices)
            {
                val Sekolah = Sekolah()
                Sekolah.nama = namaSekolah[position]
                Sekolah.kecamatan = kecSekolah[position]
                Sekolah.logo = logoSekolah[position]
                listSekolah.add(Sekolah)
            }
            return listSekolah
        }



}