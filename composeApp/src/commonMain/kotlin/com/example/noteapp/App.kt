package com.example.noteapp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.noteapp.ui.theme.NotesAppTheme
import noteapp.composeapp.generated.resources.Res
import noteapp.composeapp.generated.resources.compose_multiplatform
import noteapp.composeapp.generated.resources.rafiki
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        NotesAppTheme {
            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = {}, shape = CircleShape){
                        Text("+", fontSize =18.sp )
                    }
                }
            ) {
                Column(modifier = Modifier.padding(it)){
                    Text("Notes", modifier = Modifier.padding(16.dp),
                        fontSize = 30.sp)
                    EmptyView()
                }
            }
        }
    }
}
@Composable
fun EmptyView(){
    Box(modifier = Modifier.fillMaxWidth()){
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(painterResource(Res.drawable.rafiki),
                contentDescription = null, modifier = Modifier.size(200.dp))
            Text("Create your First Note", modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 16.sp)
        }
    }
}