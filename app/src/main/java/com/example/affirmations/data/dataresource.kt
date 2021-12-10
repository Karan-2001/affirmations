package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class DataResource {
    fun loadaff(): ArrayList<String> {
        val arrayList1 = ArrayList<String>(15)
        arrayList1.add("Ajay")//Adding object in arraylist
        arrayList1.add("Vijay")
        arrayList1.add("Prakash")
        arrayList1.add("Rohan")
        arrayList1.add("Vijay")
        arrayList1.add("Aajay")//Adding object in arraylist
        arrayList1.add("Vvijay")
        arrayList1.add("Pprakash")
        arrayList1.add("Rrohan")
        arrayList1.add("Vvijay")
        arrayList1.add("Aaajay")//Adding object in arraylist
        arrayList1.add("Vvvijay")
        arrayList1.add("Ppprakash")
        arrayList1.add("Rrrohan")
        arrayList1.add("Vvvijay")
        return arrayList1
    }
}
//}class DataResource {
//    fun loadaff():List<Affirmation> {
//        return listOf<Affirmation>(
//                Affirmation(R.string.affirmation1, R.drawable.image1),
//                Affirmation(R.string.affirmation2, R.drawable.image2),
//                Affirmation(R.string.affirmation3, R.drawable.image3),
//                Affirmation(R.string.affirmation4, R.drawable.image4),
//                Affirmation(R.string.affirmation5, R.drawable.image5),
//                Affirmation(R.string.affirmation6, R.drawable.image6),
//                Affirmation(R.string.affirmation7, R.drawable.image7),
//                Affirmation(R.string.affirmation8, R.drawable.image8),
//                Affirmation(R.string.affirmation9, R.drawable.image9),
//                Affirmation(R.string.affirmation10, R.drawable.image10))
//    }
//}