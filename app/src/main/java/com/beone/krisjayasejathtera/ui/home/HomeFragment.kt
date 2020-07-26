package com.beone.krisjayasejathtera.ui.home

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.beone.krisjayasejathtera.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.logger.Logger
import retrofit2.Retrofit

class HomeFragment : Fragment() {

    val TAG = "HomeFragment"
//    private lateinit var homeViewModel: HomeViewModel
    private val homeViewModel by viewModel<HomeViewModel>()
    val retrofit: Retrofit by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        homeViewModel =
//            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        Log.i(TAG,"Retrofit Has Build ${retrofit.hashCode()}")

        return root
    }
}
