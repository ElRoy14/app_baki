package com.appsmoviles.tarea5movil_app_tematica.ui.portada

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentPortadaBinding


class PortadaFragment : Fragment() {

    private var _binding: FragmentPortadaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPortadaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val myShader: Shader = LinearGradient(
            0f, 50f, 0f, 100f,
            Color.WHITE, Color.parseColor("#bc131f"),
            Shader.TileMode.CLAMP
        )

        binding.textPortada.text = "BAKI HANMA"
        binding.textPortada.paint.setShader(myShader)

        CargarVideo()

        return root
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun CargarVideo(){

        val webView: WebView = binding.VideoPortada

        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xniBk7zAKMY?si=2-QR6hASp2Z8eKIH\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")

        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

