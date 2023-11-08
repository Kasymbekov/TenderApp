package com.example.tenderapp.ui.home

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tenderapp.R
import com.example.tenderapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
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

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}