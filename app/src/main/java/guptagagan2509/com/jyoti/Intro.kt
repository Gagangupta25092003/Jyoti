package guptagagan2509.com.jyoti

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import guptagagan2509.com.jyoti.ui.theme.DarkThemeColor2
import guptagagan2509.com.jyoti.ui.theme.LightThemeColor
import guptagagan2509.com.jyoti.ui.theme.MedThemeColor

//@Preview
//@Composable
//fun mainScreen(){
//    lateinit var navController : NavHostController
//    letsShop(mod = Modifier
//        .fillMaxSize()
//        .wrapContentSize(Alignment.Center) )
//}

@Composable
fun letsShop(mod: Modifier = Modifier,navController: NavController){

    Box(
        modifier = mod
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(0f to LightThemeColor, 1000f to DarkThemeColor2)
            )
    )
    Column(
        modifier = mod.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "1",
            modifier = Modifier.fillMaxWidth(0.6f),
            contentScale = ContentScale.FillWidth,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text="JYOTI", fontSize = 50.sp, fontFamily = FontFamily.Serif, color = Color.Black)

        Spacer(modifier = Modifier.height(50.dp))


        ExtendedFloatingActionButton(
            text = { Text("Start Shopping", fontFamily = FontFamily.Serif, color = Color.Black , fontSize = 18.sp) },
            onClick = {
                      navController.navigate(route = Screen.Login.route)
            },
            contentColor = LightThemeColor,
            backgroundColor = DarkThemeColor2
        )

    }


}