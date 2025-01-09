package com.jetbrains.greeting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Main(
    imagePainter: Painter,
    artistName: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.75f), contentAlignment = Alignment.Center) {
            Image(
                painter = imagePainter,
                contentDescription = "Artist Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = artistName,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )
            Box(
                modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .align(Alignment.BottomCenter)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            )
                        )
                    )
            )
        }
    }
}

// 使用例 (プレビュー用)
//@Composable
//fun CenteredImageWithArtistNamePreview() {
//    // ダミーの画像リソースを使用
//    val dummyImagePainter =
//        androidx.compose.ui.res.painterResource(id = android.R.drawable.ic_menu_gallery)
//    CenteredImageWithArtistName(
//        imagePainter = dummyImagePainter,
//        artistName = "Sample Artist Name"
//    )
//}