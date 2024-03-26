package com.stewartmcm.tandem.ui

import androidx.compose.runtime.Composable

@Composable
fun DeveloperListScreen() {
    val viewModel = DeveloperListViewModel()
    viewModel.fetchDeveloperList()
}

