package com.promedia.myfigmadesign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.promedia.myfigmadesign.R
import com.promedia.myfigmadesign.databinding.FragmentAccountBinding
import com.promedia.myfigmadesign.databinding.FragmentInitBinding


class InitFragment : Fragment() {
        private var _b: FragmentInitBinding? = null
        private val b get() = _b!!

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            _b = FragmentInitBinding.inflate(inflater, container, false)
            return b.root
        }

    }