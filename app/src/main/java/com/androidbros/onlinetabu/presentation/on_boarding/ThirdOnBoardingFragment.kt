package com.androidbros.onlinetabu.presentation.on_boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.androidbros.onlinetabu.R
import com.androidbros.onlinetabu.databinding.FragmentThirdOnBoardingBinding
import com.androidbros.onlinetabu.util.SharedPref

class ThirdOnBoardingFragment : Fragment() {

    private var _binding: FragmentThirdOnBoardingBinding? = null
    private val binding get() = _binding!!
    private lateinit var mySharedPref: SharedPref

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentThirdOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mySharedPref = SharedPref(requireContext())

        binding.btnThirdOnBoardingFinish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_welcomeScreenFragment)
            isOnBoardingFinish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // onBoarding ekranlarinin tekrar gosterilmemesi icin fonksiyon
    private fun isOnBoardingFinish() {
        mySharedPref.setOnBoardingState(true)
    }

}