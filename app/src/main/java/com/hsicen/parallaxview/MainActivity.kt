package com.hsicen.parallaxview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hsicen.parallaxview.ui.theme.ParallaxViewTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ParallaxViewTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          MainContent()
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun MainContent() {
  val current = LocalContext.current

  Column {
    OutlinedButton(onClick = {
      SampleList2.start(current as ComponentActivity)
    }, modifier = Modifier.padding(16.dp)) {
      Text(
        text = "ParallaxView",
        modifier = Modifier.padding(16.dp)
      )
    }

    OutlinedButton(onClick = {
      SampleList1.start(current as ComponentActivity)
    }, modifier = Modifier.padding(16.dp)) {
      Text(
        text = "ImmersiveList",
        modifier = Modifier.padding(16.dp)
      )
    }
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  ParallaxViewTheme {
    Greeting("Android")
  }
}