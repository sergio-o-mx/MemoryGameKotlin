package com.ioconnectservices.memorygamekotlin.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.ioconnectservices.memorygamekotlin.R
import com.ioconnectservices.memorygamekotlin.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private lateinit var fragmentDashboardBinding: FragmentDashboardBinding
    private val dashboardViewModel: DashboardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentDashboardBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        fragmentDashboardBinding.lifecycleOwner = viewLifecycleOwner
        fragmentDashboardBinding.dashboardViewModel = dashboardViewModel
        setGameSelectedListener()
        return fragmentDashboardBinding.root
    }

    private fun setGameSelectedListener() {
        dashboardViewModel.gameSelected.observe(viewLifecycleOwner, {
            onBoardTypeSelected(it)
        })
    }

    private fun onBoardTypeSelected(type: Int) {
        fragmentDashboardBinding.root.findNavController().navigate(
            when (type) {
                0 -> DashboardFragmentDirections.actionDashboardFragmentToGame4x3Fragment()
                1 -> DashboardFragmentDirections.actionDashboardFragmentToGame4x4Fragment()
                else -> DashboardFragmentDirections.actionDashboardFragmentToGame4x5Fragment()
            }
        )
    }
}
