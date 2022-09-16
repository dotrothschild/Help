package com.inzhood.help.ui.help

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.inzhood.help.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val webView = binding.webView
        webView.loadUrl("file:///android_asset/first.html")

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}