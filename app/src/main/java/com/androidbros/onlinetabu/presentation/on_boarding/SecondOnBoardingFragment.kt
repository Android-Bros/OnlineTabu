package com.androidbros.onlinetabu.presentation.on_boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.androidbros.onlinetabu.R
import com.androidbros.onlinetabu.databinding.FragmentSecondOnBoardingBinding

class SecondOnBoardingFragment : Fragment() {

    private var _binding: FragmentSecondOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSecondOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.btnSecondOnBoardingForward.setOnClickListener{
            viewPager?.currentItem = 2
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}