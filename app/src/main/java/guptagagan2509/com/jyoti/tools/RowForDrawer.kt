package guptagagan2509.com.jyoti.tools

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import guptagagan2509.com.jyoti.ui.theme.DarkThemeColor3

@Composable
fun menu(modifier: Modifier,str:String, @DrawableRes imgaddress:Int ){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(25.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically )
    {

        Spacer(modifier = Modifier.fillMaxHeight().width(5.dp))

        Image(
            painter = painterResource(imgaddress),
            contentDescription = null,
            modifier = Modifier
                .height(20.dp)
                .aspectRatio(1f),
            contentScale = ContentScale.FillBounds,
            alpha = 0.5f
        )
        Spacer(modifier = Modifier.fillMaxHeight().width(15.dp))

        Text(
            text = str,
            fontSize = 16.sp,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Start,
            color = DarkThemeColor3
        )

    }
    Spacer(modifier = Modifier.height(5.dp))

}