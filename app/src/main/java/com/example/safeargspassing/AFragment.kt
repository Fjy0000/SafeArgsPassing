package com.example.safeargspassing

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.safeargspassing.databinding.FragmentABinding
import com.example.safeargspassing.databinding.FragmentBBinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =   DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        binding.btnNext.setOnClickListener() {
            Navigation.findNavController(binding.root).navigate(R.id.action_AFragment_to_BFragment)
        }
        return binding.root
    }


}