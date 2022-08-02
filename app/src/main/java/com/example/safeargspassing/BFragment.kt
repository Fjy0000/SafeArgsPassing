package com.example.safeargspassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.safeargspassing.databinding.ActivityMainBinding
import com.example.safeargspassing.databinding.FragmentBBinding

class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =   DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false)


        return binding.root
    }

}