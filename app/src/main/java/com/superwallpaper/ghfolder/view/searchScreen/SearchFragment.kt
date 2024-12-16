package com.superwallpaper.ghfolder.view.searchScreen

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.superwallpaper.ghfolder.R
import com.superwallpaper.ghfolder.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment(R.layout.fragment_search) {

    private val binding: FragmentSearchBinding by viewBinding()


    companion object {
        fun create() = SearchFragment()
    }

}