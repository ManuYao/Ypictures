package fr.Yao.ypictures.fragement.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fr.Yao.ypictures.MainActivity
import fr.Yao.ypictures.PicturesModel
import fr.Yao.ypictures.R
import java.nio.file.Files.size

class PictureAdapter(
        private val context: MainActivity,
        private val pictureList: List<PicturesModel>,
        private val layoutId: Int
        ) : RecyclerView.Adapter<PictureAdapter.ViewHolder>(){

    //boite de rangement tous les composants à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val prictureImg = view.findViewById<ImageView>(R.id.image_item)
        val pictureName:TextView? = view.findViewById(R.id.name_item)
        val pictureDesc:TextView? = view.findViewById(R.id.name_client)
        val doigt = view.findViewById<ImageView>(R.id.like_icon)
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

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        //recupere les info de la Picture
        val currentPictur = pictureList[position]

        //Utiliser glide dl img du lien -> composant
        Glide.with(context).load(Uri.parse(currentPictur.urlimg)).into(holder.prictureImg)

        //mettre à jour la description Pictures
        holder.pictureDesc?.text = currentPictur.subname

        //mettre à jour le nom client Pictures
        holder.pictureName?.text = currentPictur.name

        //check si la plante est like
        if (currentPictur.like) {
            holder.doigt.setImageResource(R.drawable.ic_like)
        }else{
            holder.doigt.setImageResource(R.drawable.ic_nolike)
        }
    }

    override fun getItemCount(): Int = pictureList.size

}