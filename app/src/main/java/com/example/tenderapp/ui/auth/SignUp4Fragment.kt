package com.example.tenderapp.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.tenderapp.R
import com.example.tenderapp.databinding.FragmentSignUp3Binding
import com.example.tenderapp.databinding.FragmentSignUp4Binding

class SignUp4Fragment : Fragment() {

    private var _binding: FragmentSignUp4Binding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignUp4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSignUp4ViewModel = ViewModelProvider(this)[SignUp4ViewModel::class.java]

        _binding = FragmentSignUp4Binding.inflate(inflater, container, false)
        val root: View = binding.root

        //Back button implementation
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        //Send code
        binding.tvCode.setOnClickListener {
            Toast.makeText(activity, "The code has been sent.", Toast.LENGTH_SHORT).show()
        }

        return root
    }


}