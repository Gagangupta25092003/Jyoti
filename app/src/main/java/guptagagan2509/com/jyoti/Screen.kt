package guptagagan2509.com.jyoti

sealed class Screen(val route : String){
    object Intro: Screen(route = "INTRO SCREEN")
    object Login: Screen(route  = "LOGIN SCREEN")
    object Main: Screen(route = "MAIN CATEGORY PAGE")
}
