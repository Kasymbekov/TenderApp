package com.example.tenderapp.ui.auth

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter.LengthFilter
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.navigation.findNavController
import com.example.tenderapp.R
import com.example.tenderapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val signInViewModel = ViewModelProvider(this)[SignInViewModel::class.java]

        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tvEmail
        signInViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        //1st button implementation
        binding.btnAuth.setOnClickListener {
            binding.btnAuth.isClickable = false
            binding.btnAuth2.isClickable = true
            binding.btnAuth.background =
                ContextCompat.getDrawable(requireActivity(), R.drawable.btn_switch_clicked)
            binding.btnAuth2.background =
                ContextCompat.getDrawable(requireActivity(), R.drawable.btn_switch2)

            //Make text bold
            binding.btnAuth.setTypeface(null, Typeface.BOLD)
            binding.btnAuth2.setTypeface(null, Typeface.NORMAL)
        }

        //2nd button implementation
        binding.btnAuth2.setOnClickListener {
            binding.btnAuth2.isClickable = false
            binding.btnAuth.isClickable = true
            binding.btnAuth2.background =
                ContextCompat.getDrawable(requireActivity(), R.drawable.btn_switch_clicked2)
            binding.btnAuth.background =
                ContextCompat.getDrawable(requireActivity(), R.drawable.btn_switch)

            //Make text bold
            binding.btnAuth2.setTypeface(null, Typeface.BOLD)
            binding.btnAuth.setTypeface(null, Typeface.NORMAL)
        }

        //Forgot password listener
        binding.tvForgotPass.setOnClickListener {
            it.findNavController().navigate(R.id.forgotPassFragment)
        }

        checkFields()

        //SignUp textview listener
        binding.tvSignup.setOnClickListener {
            it.findNavController().navigate(R.id.signUpFragment)
        }

        return root
    }

    //Sign in button implementation
    private fun checkFields() {
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
                if (binding.etPass.text.isNotEmpty() && s.isNotEmpty()) {
                    binding.btnAuth3.alpha = 1.0F
                    binding.btnAuth3.isClickable = true
                } else {
                    binding.btnAuth3.alpha = 0.5F
                    binding.btnAuth3.isClickable = false
                }
            }
        })

        binding.etPass.addTextChangedListener(object : TextWatcher {
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
                if (binding.etEmail.text.isNotEmpty() && s.isNotEmpty()) {
                    binding.btnAuth3.alpha = 1.0F
                    binding.btnAuth3.isClickable = true
                } else {
                    binding.btnAuth3.alpha = 0.5F
                    binding.btnAuth3.isClickable = false
                }
            }
        })
    }

}