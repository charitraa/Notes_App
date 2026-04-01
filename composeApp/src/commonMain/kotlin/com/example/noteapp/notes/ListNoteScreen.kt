package com.example.noteapp.notes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.noteapp.model.Note


@Composable
fun ListNoteScreen(list:List<Note>){
    LazyColumn {
      items(list){
          NoteItem(note = it)
      }
    }
}

fun getRandomColor (): Color{
    return Color((155..255).random(),(155..255).random(),(155..255).random())
}

@Composable
fun NoteItem(note: Note){
    Box(modifier = Modifier.padding(8.dp).fillMaxWidth().padding(8.dp).clip(RoundedCornerShape(size = 8.dp)).background(getRandomColor()).padding(8.dp)){
        Text(
            text = note.title, fontSize = 22.sp
        )
    }
}