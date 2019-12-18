package com.example.planner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.planner.databinding.AddTaskFragmentBinding

class AddTaskFragment: Fragment() {

    private lateinit var binding: AddTaskFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = AddTaskFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}