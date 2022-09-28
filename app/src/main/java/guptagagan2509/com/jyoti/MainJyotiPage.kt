package guptagagan2509.com.jyoti

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import guptagagan2509.com.jyoti.tools.menu
import guptagagan2509.com.jyoti.ui.theme.*

@Preview(showBackground = true)
@Composable
fun MainJyotiPagePreview(){
    MainJyotiPage(modifier = Modifier
        .fillMaxSize()
    )
}

@Composable
fun MainJyotiPage(modifier: Modifier){

    val constrains = ConstraintSet(){

        val guideline1 = createGuidelineFromTop(0.0f)
        val guideline2 = createGuidelineFromTop(120.dp)
        val guideline3 = createGuidelineFromBottom(50.dp)
        val kids_Icon = createRefFor("MainIcons")
        val mainColumn = createRefFor("MainColumn")

        constrain(kids_Icon){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(guideline1)
            bottom.linkTo(guideline2)
            height = Dimension.fillToConstraints
        }
        constrain(mainColumn){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(guideline2)
            bottom.linkTo(guideline3)
            height = Dimension.fillToConstraints
        }

    }

    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))

    Scaffold(
        scaffoldState = scaffoldState,

        topBar = {
            TopAppBar(
                title = {Text("Jyoti")},
                backgroundColor = DarkThemeColor,
            )},
        drawerContent = {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = LightThemeColor),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(10.dp))

                            Image(
                                painter = painterResource(id = R.drawable.loginicon),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(100.dp),
                                contentScale = ContentScale.FillHeight
                            )
                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = "MY NAME",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = LightThemeColor2)
                            ) {
                                Spacer(modifier = Modifier.height(15.dp))

                                menu(modifier = modifier, str = "My Orders", imgaddress = R.drawable.myorders)
                                menu(modifier = modifier, str = "My Accounts", imgaddress = R.drawable.myaccount)
                                menu(modifier = modifier, str = "Notification", imgaddress = R.drawable.notification)
                                menu(modifier = modifier, str = "Contact Us", imgaddress = R.drawable.contactus)
                                menu(modifier = modifier, str = "About us", imgaddress = R.drawable.aboutus)

                            }

                        }
        },

        content = {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(color = LightThemeColor2)
            )

            ConstraintLayout(constrains, modifier = modifier.fillMaxSize()) {

                val scrollState1 = rememberScrollState()
                val scrollState2 = rememberScrollState()


                Column(
                    modifier = modifier
                        .layoutId("MainColumn")
                        .padding(top = 10.dp)
                        .verticalScroll(scrollState2),
                    verticalArrangement = Arrangement.Top,

                ) {

                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1.5f)
                            .shadow(8.dp)
                            .clip(RoundedCornerShape(25.dp))
                            .padding(4.dp),
                        painter = painterResource(id = R.drawable.loginpageimage),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(4f)
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ){

                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(4f)
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .fillMaxHeight()
                                .clip(CircleShape)
                                .background(color = DarkThemeColor),
                            painter = painterResource(id = R.drawable.imageicon_1),
                            contentDescription = null
                        )

                    }
                }


                Row(
                    modifier = modifier
                        .layoutId("MainIcons")
                        .horizontalScroll(scrollState1),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ){
                    Card(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(25.dp),
                        elevation = 8.dp
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier.aspectRatio(1.5f),
                                painter = painterResource(id = R.drawable.kids),
                                contentDescription = null,
                                contentScale = ContentScale.Inside
                            )
                            Text(
                                modifier = modifier.fillMaxSize(),
                                text = "Kids",
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )
                            
                        }


                    }

                    Card(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(25.dp),
                        elevation = 8.dp
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier.aspectRatio(1.5f),
                                painter = painterResource(id = R.drawable.kids),
                                contentDescription = null,
                                contentScale = ContentScale.Inside
                            )
                            Text(
                                modifier = modifier.fillMaxSize(),
                                text = "Women",
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }


                    }

                    Card(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(25.dp),
                        elevation = 8.dp
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier.aspectRatio(1.5f),
                                painter = painterResource(id = R.drawable.kids),
                                contentDescription = null,
                                contentScale = ContentScale.Inside
                            )
                            Text(
                                modifier = modifier.fillMaxSize(),
                                text = "Men",
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }


                    }

                }
            }
        },
        bottomBar = { BottomAppBar(backgroundColor = DarkThemeColor) { Text("BottomAppBar") } }
    )


}