package deg.lessons.composenotes.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import deg.lessons.composenotes.screens.Add
import deg.lessons.composenotes.screens.Main
import deg.lessons.composenotes.screens.Note
import deg.lessons.composenotes.screens.Start

sealed class NavRoute(val route: String){
    object Start: NavRoute("start_screen")
    object Main: NavRoute("main_screen")
    object Add: NavRoute("add_screen")
    object Note: NavRoute("note_screen")
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun NotesNavHost(){
  val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Start.route){
        composable(NavRoute.Start.route){ Start(navController = navController) }
        composable(NavRoute.Main.route){ Main(navController = navController) }
        composable(NavRoute.Add.route){ Add(navController = navController) }
        composable(NavRoute.Note.route){ Note(navController = navController) }
    }
}