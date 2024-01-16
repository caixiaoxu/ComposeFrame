package com.lsy.composewidget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.lsy.base.theme.PrimaryColor

@Composable
fun MoviesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "电影",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun BooksScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "书籍",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "个人中心",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
