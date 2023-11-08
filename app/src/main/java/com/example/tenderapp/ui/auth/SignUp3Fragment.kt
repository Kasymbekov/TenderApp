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
import com.example.tenderapp.databinding.FragmentSignUp3Binding

class SignUp3Fragment : Fragment() {

    private var _binding: FragmentSignUp3Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignUp3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSignUp3ViewModel = ViewModelProvider(this)[SignUp3ViewModel::class.java]

        _binding = FragmentSignUp3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        //Next btn listener
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.signUp4Fragment)
        }

        //Back button implementation
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return root
    }


}