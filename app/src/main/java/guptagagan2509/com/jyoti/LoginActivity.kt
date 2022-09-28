package guptagagan2509.com.jyoti

import android.icu.number.Scale
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import guptagagan2509.com.jyoti.ui.theme.*


//@Preview(showBackground = true)
//@Composable
//fun LoginActivityPreview(){
//    lateinit var navController: NavController
//    LoginActivityMain(
//        modifier = Modifier
//            .fillMaxSize())
//}

@Composable
fun LoginActivityMain(modifier: Modifier  = Modifier,navController: NavController) {
    
    Box(modifier = Modifier.fillMaxSize().background(color = LightThemeColor2))



    val constrains = ConstraintSet(){
        val loginImage = createRefFor("LOGINIMAGE")
        val loginIcon = createRefFor("LOGINICON")
        val loginButton = createRefFor("LOGINBUTTON")
        val guideline1 = createGuidelineFromBottom(0.7f)
        val guideline2 = createGuidelineFromBottom(0.60f)
        val guideline3 = createGuidelineFromBottom(0.74f)
        val guideline4 = createGuidelineFromBottom(0.4f)



        constrain(loginImage){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(guideline1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints

        }
        constrain(loginIcon){

            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(guideline3)
            bottom.linkTo(guideline2)
            height = Dimension.fillToConstraints
        }
        constrain(loginButton){

            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(guideline4)
        }
    }

    ConstraintLayout(constrains, modifier = Modifier.fillMaxSize()) {

        Image(
            modifier = Modifier
                .layoutId("LOGINIMAGE")
                .background(color = Color.White),
            painter = painterResource(id = R.drawable.loginpageimage),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Image(
            modifier = Modifier
                .layoutId("LOGINICON")
                .size(100.dp)
                .clip(CircleShape)
                .background(color = LightThemeColor2)
                .aspectRatio(1f),
            painter = painterResource(id = R.drawable.loginicon),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,


        )
        ExtendedFloatingActionButton(
            modifier = Modifier.layoutId("LOGINBUTTON"),
            text = { Text("LOGIN", fontFamily = FontFamily.Serif, color = Color.Black , fontSize = 18.sp) },
            onClick = {
                      navController.navigate(route = Screen.Main.route)
            },
            contentColor = LightThemeColor,
            backgroundColor = MedThemeColor
        )


    }





}


