package com.learnandroid.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learnandroid.composetutorial.ui.theme.ComposeTutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MesseageCard(Message("Android", "Jetpack Compose"))
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MesseageCard(msg: Message){
    //I need to add  padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)){
        Image(
            painter = painterResource(R.drawable.finn),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                //Set the image size to 40 dp
                .size(40.dp)
                //Clip the image to be shaped as a cricle
                .clip(CircleShape)
        )
        Column() {
            Text(text = msg.author)
            //Add a vertical space between the author and body texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }

}

@Preview
@Composable
fun PreviewMesseageCard(){
    MesseageCard(
        msg = Message("Finn", "Hey, take a look at Jetpack Compose, its great!")
    )
}