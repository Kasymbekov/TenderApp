package com.example.tenderapp.ui.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tenderapp.R

class SignUp2Fragment : Fragment() {

    companion object {
        fun newInstance() = SignUp2Fragment()
    }

    private lateinit var viewModel: SignUp2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignUp2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}