package com.learnandroid.composetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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
            MesseageCard(Message("JESDO", "Hey, take a look at Jetpack Compose, its great!"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MesseageCard(msg: Message){
    //I need to add  padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)){
        Image(
            painter = painterResource(R.drawable.selection),
            contentDescription = null,
            modifier = Modifier
                //Set the image size to 40 dp
                .size(40.dp)
                //Clip the image to be shaped as a cricle
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Column() {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )
            //Add a vertical space between the author and body texts
            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp){
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }

}

@Composable
fun Conversation(messages: List<Message>){
    LazyColumn{
        items(messages){messages ->
            MesseageCard(messages)
        }
    }
}

//Preview Normal sin Modo claro o oscuro
@Preview
@Composable
fun PreviewMesseageCard1(){
    MesseageCard(
        msg = Message("JESDO", "Hey, take a look at Jetpack Compose, its great!")
    )
}

@Preview
@Composable
fun PreviewConversation(){
    ComposeTutorial1Theme{
        Conversation(SampleData.conversationSample)
    }
}
/**
 * A Composable function that previews the `MesseageCard` component.
 * It's annotated with `@Preview` to be visible in Android Studio's preview pane.
 * This function sets up two previews: one for "Light Mode" and another for "Dark Mode",
 * allowing for easy visual testing of the UI in different theme configurations.
 * It wraps the `MesseageCard` in a `ComposeTutorial1Theme` and a `Surface` to provide
 * the necessary theming and background.
 */
//Preview con Modo Claro y Oscuro
@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)

@Composable
fun PreviewMessageCard2() {
    ComposeTutorial1Theme{
        Surface {
            MesseageCard(
                msg = Message("JESDO", "Hey, take a look at Jetpack Compose, its great!")
            )
        }
    }
}