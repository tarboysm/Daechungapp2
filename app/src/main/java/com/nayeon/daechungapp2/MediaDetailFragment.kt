package com.nayeon.daechungapp2
import android.os.Bundle
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

class MediaDetailFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.media_detail, container, false)

        val dev: Button = view.findViewById(R.id.dev)


        dev.setOnClickListener {


            findNavController().navigate(R.id.media_detail_job_fragment)
        }



        return view
    }


}