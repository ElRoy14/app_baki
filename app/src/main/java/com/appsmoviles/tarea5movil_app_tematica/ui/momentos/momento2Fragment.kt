package com.appsmoviles.tarea5movil_app_tematica.ui.momentos

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.fragment.app.commit
import com.appsmoviles.tarea5movil_app_tematica.R
import com.appsmoviles.tarea5movil_app_tematica.databinding.FragmentMomento2Binding

class momento2Fragment : Fragment() {

    private var _binding: FragmentMomento2Binding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMomento2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val myShader: Shader = LinearGradient(
            0f, 30f, 0f, 55f,
            Color.WHITE, Color.parseColor("#bc131f"),
            Shader.TileMode.CLAMP
        )

        binding.textMomento2.text = "RETSU KAIOH VS PICKLE"
        binding.textMomento2.paint.setShader(myShader)

        CargarVideo()

        binding.btnSalida.setOnClickListener{
            childFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                replace(R.id.fragment_momento2, MomentosFragment())
            }
        }

        return root
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun CargarVideo(){

        val webView: WebView = binding.VideoMomento2

        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2wrmf5Ejmc4?si=KoOh9Djnwg02xXoa\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")

        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()

    }

}