package fr.Yao.ypictures.fragement.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.Yao.ypictures.R

class PictureAdapter(private val layoutId: Int) : RecyclerView.Adapter<PictureAdapter.ViewHolder>(){

    //boite de rangement tous les composants à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val prictureImg = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(layoutId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //mise à jour modèle
    }

    override fun getItemCount(): Int = 5

}