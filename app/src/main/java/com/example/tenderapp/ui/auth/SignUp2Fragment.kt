package com.example.tenderapp.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.tenderapp.R
import com.example.tenderapp.databinding.FragmentSignUp2Binding
import com.example.tenderapp.databinding.FragmentSignUpBinding

class SignUp2Fragment : Fragment() {

    private var _binding: FragmentSignUp2Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignUp2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSignUp2ViewModel = ViewModelProvider(this)[SignUp2ViewModel::class.java]

        _binding = FragmentSignUp2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        //Back button implementation
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        //Next btn listener
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.signUp3Fragment)
        }

        //SignIn textview listener
        binding.tvSignin.setOnClickListener {
            it.findNavController().navigate(R.id.signInFragment)
        }

        return root
    }

}