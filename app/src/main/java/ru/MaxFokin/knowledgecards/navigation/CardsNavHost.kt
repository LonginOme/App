package ru.MaxFokin.knowledgecards.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.MaxFokin.knowledgecards.screens.Add
import ru.MaxFokin.knowledgecards.screens.Card
import ru.MaxFokin.knowledgecards.screens.Main
import ru.MaxFokin.knowledgecards.screens.Start

sealed class NavRoute(var route: String){
    object Start: NavRoute(route = "start_screen")
    object Main: NavRoute(route = "main_screen")
    object Add: NavRoute(route = "add_screen")
    object Card: NavRoute(route = "card_screen")
}
@Composable
fun CardsNavHost() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Start.route){
        composable(NavRoute.Start.route){ Start(navController = navController) }
        composable(NavRoute.Main.route){ Main(navController = navController) }
        composable(NavRoute.Add.route){ Add(navController = navController) }
        composable(NavRoute.Card.route){ Card(navController = navController) }
    }
}