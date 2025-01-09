package com.jetbrains.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Main(
                imagePainter = painterResource(id = R.drawable.nekophoto7066),
                artistName = "Sample Artist Name"
            )
//            Greetings(modifier = Modifier.padding(40.dp))
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    var expanded by rememberSaveable { mutableStateOf(false) }
//    val extraPadding by animateDpAsState(if (expanded) 48.dp else 0.dp)
//    Surface(color = MaterialTheme.colors.primary,modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
//        Row(modifier = Modifier.padding(24.dp).padding(bottom = extraPadding)) {
//            Column(
//                modifier = modifier
//                    .weight(1f)
//            ) {
//                Text(
//                    text = "Hello $name!",
//                )
//                Text(
//                    text = "test",
//                )
//                if (expanded) {
//                    Text(
//                        text = ("Composem ipsum color sit lazy, " +
//                                "padding theme elit, sed do bouncy. ").repeat(4),
//                    )
//                }
//            }
//            Button(
//                modifier = Modifier.padding(start = 24.dp),
//                onClick = { expanded = !expanded }
//            ) {
//                Text(if (expanded) "Show less" else "Show more")
//            }
//        }
//    }
//}
//
//
//@Preview
//@Composable
//private fun Greetings(
//    modifier: Modifier = Modifier,
//    names: List<String> = List(1000) { "$it" }
//) {
//    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
//        items(items = names) { name ->
//            Greeting(name = name)
//        }
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    BasicsCodelabTheme {
//        Greeting("Android")
//    }
//}

