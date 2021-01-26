package fr.Yao.ypictures.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.Yao.ypictures.R

class HomeFragement : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
                            ): View? {
                                 return inflater?.inflate(R.layout.fragement_home, container, false)

    }
}