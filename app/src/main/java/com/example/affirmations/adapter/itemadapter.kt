package com.example.affirmations.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.data.DataResource
import com.example.affirmations.model.Affirmation
import java.util.*
import kotlin.collections.ArrayList

class ItemAdapter(

) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(),Filterable {
    private val dataset =DataResource().loadaff()
    var FilterList = ArrayList<String>()

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        // val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    init {
        FilterList = dataset
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = FilterList[position]
        holder.textView.text = item

    }

    override fun getItemCount(): Int {
        return FilterList.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    FilterList = dataset
                }
                else{
                    val resultList = ArrayList<String>()
                    for (row in dataset) {
                        if (row.toLowerCase(Locale.ROOT).contains(charSearch.toLowerCase(Locale.ROOT))) {
                            resultList.add(row)
                        }
                    }
                    FilterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = FilterList
                return filterResults
            }
            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                FilterList = results?.values as ArrayList<String>
                notifyDataSetChanged()
                Log.e("FilterList", "=>$FilterList")
            }


        }
    }
}

//}package com.example.affirmations.adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.affirmations.R
//import com.example.affirmations.model.Affirmation
//
//class ItemAdapter(
//    private val context: Context,
//    private val dataset: List<Affirmation>
//) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//
//    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
//        val textView: TextView = view.findViewById(R.id.item_title)
//        val imageView: ImageView = view.findViewById(R.id.item_image)
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        // create a new view
//        val adapterLayout = LayoutInflater.from(parent.context)
//                .inflate(R.layout.list_layout, parent, false)
//
//        return ItemViewHolder(adapterLayout)
//    }
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item = dataset[position]
//        holder.textView.text =  context.resources.getString(item.stringResourceId)
//        holder.imageView.setImageResource(item.imageResourceId)
//    }
//
//    override fun getItemCount(): Int {
//        return dataset.size
//    }
//}