package com.lsy.composewidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lsy.base.theme.ComposeWidgetTheme
import com.lsy.base.theme.PrimaryColor
import com.lsy.news.headlinenews.HeadlineNewsComposable
import com.lsy.news.headlinenews.HeadlineNewsComposableModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWidgetTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding),
        ) {
            Navigation(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name), fontSize = 18.sp) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = PrimaryColor,
            titleContentColor = Color.White
        )
    )
}

@Composable
fun BottomBar(navController: NavHostController) {

}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            val headlineNewsViewModel: HeadlineNewsComposableModel =
                ViewModelProvider(navController.context as ViewModelStoreOwner)[HeadlineNewsComposableModel::class.java]
            HeadlineNewsComposable(headlineNewsViewModel)
        }
        composable(NavigationItem.Movies.route) {
            MoviesScreen()
        }
        composable(NavigationItem.Books.route) {
            BooksScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}