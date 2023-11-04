package com.example.tenderapp.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.tenderapp.R
import com.example.tenderapp.databinding.FragmentForgotPassBinding
import com.example.tenderapp.databinding.FragmentSignInBinding

class ForgotPassFragment : Fragment() {

    private var _binding: FragmentForgotPassBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ForgotPassViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val forgotPassViewModel = ViewModelProvider(this)[SignInViewModel::class.java]

        _binding = FragmentForgotPassBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.tvEmail
//        signInViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    binding.btnCode.alpha = 1.0F
                    binding.btnCode.isClickable = true
                } else {
                    binding.btnCode.alpha = 0.5F
                    binding.btnCode.isClickable = false
                }
            }
        })

        return root
    }

}