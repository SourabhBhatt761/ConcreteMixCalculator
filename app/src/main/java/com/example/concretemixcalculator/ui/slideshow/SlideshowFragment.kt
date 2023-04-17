package com.example.concretemixcalculator.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.concretemixcalculator.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        showPdfFromAssets(getPdfNameFromAssets())

        return binding.root
    }

    fun getPdfNameFromAssets(): String {
        return "report.pdf"
    }

    private fun showPdfFromAssets(pdfName: String) {
        binding.pdfView.fromAsset(pdfName)
            .password(null) // if password protected, then write password
            .defaultPage(0) // set the default page to open
            .onPageError { page, _ ->
                Toast.makeText(
                    requireContext(),
                    "Error at page: $page", Toast.LENGTH_LONG
                ).show()
            }
            .load()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}