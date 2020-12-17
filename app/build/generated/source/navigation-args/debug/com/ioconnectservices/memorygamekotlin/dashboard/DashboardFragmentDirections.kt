package com.ioconnectservices.memorygamekotlin.dashboard

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ioconnectservices.memorygamekotlin.R

public class DashboardFragmentDirections private constructor() {
  public companion object {
    public fun actionDashboardFragmentToGame4x4Fragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboardFragment_to_game4x4Fragment)

    public fun actionDashboardFragmentToGame4x3Fragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboardFragment_to_game4x3Fragment)

    public fun actionDashboardFragmentToGame4x5Fragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dashboardFragment_to_game4x5Fragment)
  }
}
