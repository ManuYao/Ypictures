package fr.Yao.ypictures.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.Yao.ypictures.MainActivity
import fr.Yao.ypictures.PicturesModel
import fr.Yao.ypictures.R
import fr.Yao.ypictures.fragement.adapter.PictureAdapter
import fr.Yao.ypictures.fragement.adapter.PicturesItemDecoration
import java.util.ArrayList

class HomeFragement(
    private val context: MainActivity
) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
                            ): View? {
                                 val view = inflater?.inflate(R.layout.fragement_home, container, false)

        //crée un liste qui va stiker les Pictures
        val pictureListe = arrayListOf<PicturesModel>()

        //1 Model test
        pictureListe.add(PicturesModel(
                "Nouriture",
                "Yao",
                "https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040_960_720.jpg",
                false
        ))

        //2 Model test
        pictureListe.add(PicturesModel(
                "Une vraie Chat!!!",
                "Marie",
                "https://cdn.pixabay.com/photo/2016/06/14/00/14/cat-1455468_960_720.jpg",
                false
        ))

        //3 Model test
        pictureListe.add(PicturesModel(
                "halloween",
                "Yao",
                "https://cdn.pixabay.com/photo/2017/10/26/20/00/pumpkin-2892303_960_720.jpg",
                false
        ))

        //4 Model test
        pictureListe.add(PicturesModel(
                "l'objectif ;)",
                "Akissi",
                "https://cdn.pixabay.com/photo/2016/06/23/01/23/floor-plan-1474454_960_720.jpg",
                true
        ))

        //recupere le recyclerview
        val horizontalrecyclerview= view?.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalrecyclerview?.adapter = PictureAdapter(context, pictureListe, R.layout.item_horizontal_picture)

        //recupere le recyclerview
        val verticalrecyclerview= view?.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalrecyclerview?.adapter = PictureAdapter(context, pictureListe, R.layout.item_vertical_pictures)
        verticalrecyclerview?.addItemDecoration(PicturesItemDecoration())
        return view

    }
}