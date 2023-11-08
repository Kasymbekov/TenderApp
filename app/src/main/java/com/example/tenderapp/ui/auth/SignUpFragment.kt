package com.example.tenderapp.ui.auth

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.tenderapp.R
import com.example.tenderapp.R.color.color_switch
import com.example.tenderapp.databinding.FragmentForgotPassBinding
import com.example.tenderapp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignUpViewModel

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSignUpViewModel = ViewModelProvider(this)[SignUpViewModel::class.java]

        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //Back button implementation
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        //SignIn textview listener
        binding.tvSignin.setOnClickListener {
            it.findNavController().navigate(R.id.signInFragment)
        }

        //Save the choice
        binding.cardView.setOnClickListener {
            binding.cardView.setCardBackgroundColor(Color.parseColor("#ACCCF8"))
            binding.cardView2.setCardBackgroundColor(Color.parseColor("#FFFFFFFF"))
        }
        binding.cardView2.setOnClickListener {
            binding.cardView2.setCardBackgroundColor(Color.parseColor("#ACCCF8"))
            binding.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFFFF"))
        }

        //Next btn listener
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.signUp2Fragment)
        }

        return root
    }

}