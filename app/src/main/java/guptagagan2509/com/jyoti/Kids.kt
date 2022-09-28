package guptagagan2509.com.jyoti

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun KidsPreview(){

    kids(modifier = Modifier.fillMaxSize())
}

@Composable
fun kids(modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Cyan)
    ){

    }
}