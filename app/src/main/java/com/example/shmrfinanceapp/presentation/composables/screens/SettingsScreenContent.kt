package com.example.shmrfinanceapp.presentation.composables.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shmrfinanceapp.presentation.composables.SettingItem
import com.example.shmrfinanceapp.presentation.theme.GreenDark
import com.example.shmrfinanceapp.presentation.theme.GreenLight

val settingsItems = listOf(
    "Основной цвет",
    "Звуки",
    "Хаптики",
    "Код пароль",
    "Синхронизация",
    "Язык",
    "О программе"
)

@Composable
fun SettingsScreenContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var isDarkTheme by remember { mutableStateOf(false) }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isDarkTheme=!isDarkTheme }
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text="Светлая тёмная авто")
            Switch(
                checked = isDarkTheme,
                onCheckedChange = { isDarkTheme=!isDarkTheme },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = GreenLight,
                    checkedTrackColor = GreenDark,
                )
            )
        }
        HorizontalDivider()
        LazyColumn {
            items(settingsItems) { title ->
                SettingItem(title = title) {
                    // Обработка нажатия
                }
                HorizontalDivider()
            }
        }
    }
}