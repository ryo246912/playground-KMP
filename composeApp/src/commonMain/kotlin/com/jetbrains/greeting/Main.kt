package com.jetbrains.greeting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Main(
    imagePainter: Painter,
    artistName: String,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            var boxHeight by remember { mutableStateOf(0) }

            Box(
                modifier =
                    Modifier.fillMaxWidth().fillMaxHeight(0.75f).onGloballyPositioned { coordinates ->
//          高さを取得
                        boxHeight = coordinates.size.height
                    },
            ) {
                Image(
                    painter = imagePainter,
                    contentDescription = "Artist Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )
                Box(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.5f)
                            .align(Alignment.BottomCenter)
                            .background(
                                brush =
                                    Brush.verticalGradient(
                                        colors =
                                            listOf(
                                                Color.Transparent,
                                                Color.Black,
                                            ),
                                    ),
                            ),
                )
                Text(
                    text = artistName,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier =
                        Modifier
                            .align(Alignment.TopCenter)
                            .offset {
                                IntOffset(
                                    x = 0,
                                    y = (boxHeight * 0.75f).toInt(),
                                )
                            }.padding(16.dp),
                )
            }
        }
        items(10, key = { index -> "$index" }) { index ->
            Column {
                Image(
                    painter = imagePainter,
                    contentDescription = "Artist Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = List(400) { ('A'..'Z').random() }.joinToString(""),
                    fontSize = 12.sp,
                    modifier = Modifier.padding(8.dp),
                )
            }
        }
    }
}


// 使用例 (プレビュー用)
// @Composable
// fun CenteredImageWithArtistNamePreview() {
//    // ダミーの画像リソースを使用
//    val dummyImagePainter =
//        androidx.compose.ui.res.painterResource(id = android.R.drawable.ic_menu_gallery)
//    CenteredImageWithArtistName(
//        imagePainter = dummyImagePainter,
//        artistName = "Sample Artist Name"
//    )
// }
