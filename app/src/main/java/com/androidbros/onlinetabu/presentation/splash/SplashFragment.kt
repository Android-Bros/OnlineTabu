package com.androidbros.onlinetabu.presentation.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.androidbros.onlinetabu.R
import com.androidbros.onlinetabu.databinding.FragmentSplashBinding
import com.androidbros.onlinetabu.util.Constant.SPLASH_SCREEN_TIME
import com.androidbros.onlinetabu.util.SharedPref

class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    private lateinit var mySharedPref: SharedPref

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mySharedPref = SharedPref(requireContext())

        Handler(Looper.getMainLooper()).postDelayed({
            if (mySharedPref.loadOnBoardingState()) {
                // findNavController().navigate(R.id.action_splashFragment_to_girisKayitFragment)
            } else {
                findNavController().navigate(R.id.action_splashFragment_to_firstOnBoardingFragment)
            }
        }, SPLASH_SCREEN_TIME)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}