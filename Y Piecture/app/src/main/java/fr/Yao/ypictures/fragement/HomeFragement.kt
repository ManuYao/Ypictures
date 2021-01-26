package fr.Yao.ypictures.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.Yao.ypictures.R
import fr.Yao.ypictures.fragement.adapter.PictureAdapter
import fr.Yao.ypictures.fragement.adapter.PicturesItemDecoration

class HomeFragement : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
                            ): View? {
                                 val view = inflater?.inflate(R.layout.fragement_home, container, false)

        //recupere le recyclerview
        val horizontalrecyclerview= view?.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalrecyclerview?.adapter = PictureAdapter(R.layout.item_horizontal_picture)

        //recupere le recyclerview
        val verticalrecyclerview= view?.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalrecyclerview?.adapter = PictureAdapter(R.layout.item_vertical_pictures)
        verticalrecyclerview?.addItemDecoration(PicturesItemDecoration())
        return view

    }
}