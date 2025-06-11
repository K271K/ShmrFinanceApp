package com.example.shmrfinanceapp.presentation.composables.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.shmrfinanceapp.R
import com.example.shmrfinanceapp.presentation.composables.ArticleItem
import com.example.shmrfinanceapp.presentation.composables.ExpenseItem
import com.example.shmrfinanceapp.presentation.models.ArticleModel
import com.example.shmrfinanceapp.presentation.theme.ShmrFinanceAppTheme

val articleMockList = listOf(
    ArticleModel(
        icon = "\uD83C\uDFE0",
        label = "Аренда квартиры",
    ),
    ArticleModel(
        icon = "\uD83D\uDC57",
        label = "Одежда",
    ),
    ArticleModel(
        icon = "\uD83D\uDC36",
        label = "На собачку",
    ),
    ArticleModel(
        icon = "\uD83D\uDC36",
        label = "На собачку",
    ),
    ArticleModel(
        icon = "РК",
        label = "Ремонт квартиры",
    ),
    ArticleModel(
        icon = "\uD83C\uDF6D",
        label = "Продукты",
    ),
    ArticleModel(
        icon = "\uD83C\uDFCB\uFE0F\u200D♂\uFE0F",
        label = "Спортзал",
    ),
    ArticleModel(
        icon = "\uD83D\uDC8A",
        label = "Медицина",
    )
)

@Composable
fun ArticlesScreenContent(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = {Text("Найти статью")},
            modifier = Modifier.fillMaxWidth().background(colorResource(R.color.gray_light)),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Find an article"
                )
            }
        )
        HorizontalDivider()
        LazyColumn {
            items(articleMockList){ article->
                ArticleItem(article)
                HorizontalDivider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlesScreenContentPreview(){
    ShmrFinanceAppTheme {
        ArticlesScreenContent()
    }
}