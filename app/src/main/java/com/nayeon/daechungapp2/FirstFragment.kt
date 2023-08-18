package com.nayeon.daechungapp2
import   android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.nayeon.daechungapp2.R
import androidx.fragment.app.FragmentTransaction

import com.nayeon.daechungapp2.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val btn2: Button = view.findViewById(R.id.btn2)


        btn2.setOnClickListener {


            findNavController().navigate(R.id.media_detail_fragment)
        }



        return view
    }


}



