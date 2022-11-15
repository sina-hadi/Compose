package com.codinginflow.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.codinginflow.compose.blur.BlurScreen
import com.codinginflow.compose.bottom_navigation.BottomNavMainScreen
import com.codinginflow.compose.color_picker.ColorPicker
import com.codinginflow.compose.color_picker.ImageColorPicker
import com.codinginflow.compose.hyperlink.HyperlinkText
import com.codinginflow.compose.item_select.SelectableItem
import com.codinginflow.compose.loading_dots.LoadingAnimation
import com.codinginflow.compose.myui.CounterMainScreen
import com.codinginflow.compose.photo_picker.PhotoPicker
import com.codinginflow.compose.navigation.nav_graph.SetupNavGraph
import com.codinginflow.compose.premission.RequestMultiplePermissions
import com.codinginflow.compose.search.MainScreen
import com.codinginflow.compose.search.MainViewModel
import com.codinginflow.compose.shimmer.AnimatedShimmer
import com.codinginflow.compose.splash.SplashSetupNavGraph
import com.codinginflow.compose.swipe.SwipeItem2
import com.codinginflow.compose.ui.theme.ComposeTheme
import com.codinginflow.compose.web_browser.WebBrowser
import com.google.accompanist.permissions.ExperimentalPermissionsApi

@ExperimentalPermissionsApi
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    private val mainViewModel: MainViewModel by viewModels()

    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)
                SplashSetupNavGraph(navController = navController)

                BottomNavMainScreen()

                MainScreen(mainViewModel = mainViewModel)

                AnimatedShimmer()

                LoadingAnimation()

                var selected by remember { mutableStateOf(false) }
                SelectableItem(selected = selected, title = "Lorem Ipsum", subtitle = "sina hadi hey ",
                    onClick = {
                        selected = !selected
                    }
                )

                SwipeItem2()

                RequestMultiplePermissions(
                    permissions = listOf(
                        android.Manifest.permission.READ_CONTACTS,
                        android.Manifest.permission.CAMERA
                    )
                )

                HyperlinkText(
                    fullText = "By using our services are agreeing to our\n" + "Terms and Privacy statement",
                    hyperLinks = mutableMapOf(
                        "Terms" to "https://google.com",
                        "Privacy statement" to "https://www.youtube.com/watch?v=gNzPGI9goU0&list=PLSrm9z4zp4mEWwyiuYgVMWcDFdsebhM-r&index=54"
                    )
                )

                WebBrowser()

                CounterMainScreen()

                ColorPicker()
                ImageColorPicker()

                PhotoPicker()

                BlurScreen()
            }
        }
    }
}

// Splash Screen
/*
@ExperimentalAnimationApi
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

   @Inject
   lateinit var splashViewModel: SplashViewModel

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)

       installSplashScreen().setKeepOnScreenCondition {
           splashViewModel.isLoading.value
       }

       setContent {
           ComposeTheme {
               val screen by splashViewModel.startDestination
               val navController = rememberNavController()
               OnNavGraph(navController = navController, startDestination = screen)
           }
       }
   }
}
*/