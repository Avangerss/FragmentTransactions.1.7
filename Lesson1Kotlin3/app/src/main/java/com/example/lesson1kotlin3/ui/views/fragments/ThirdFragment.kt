package com.example.lesson1kotlin3.ui.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lesson1kotlin3.R
import com.example.lesson1kotlin3.data.models.ThirdViewModel
import com.example.lesson1kotlin3.databinding.FragmentThirdBinding
import com.example.lesson1kotlin3.ui.views.preferens.SharedPreferens

class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding: FragmentThirdBinding get() = _binding!!
    private val thirdViewModel: ThirdViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()

    }

    private fun setupListener() = with(binding) {
        binding.btnThird.setOnClickListener {
            val name = binding.edThirdName.text.toString().trim()
            val age = binding.edThirdAge.text.toString().trim()
            val email = binding.edThirdEmail.text.toString().trim()
            val password = binding.edThirdRassword.text.toString().trim()

            thirdViewModel.saveUserData(requireContext(), name, age, email, password)
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}