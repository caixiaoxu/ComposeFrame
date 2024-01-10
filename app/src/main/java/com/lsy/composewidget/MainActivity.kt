package com.lsy.composewidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lsy.composewidget.ui.theme.ComposeWidgetTheme
import com.lsy.composewidget.ui.theme.PrimaryColor
import com.lsy.composewidget.ui.theme.PrimaryColor500
import com.lsy.composewidget.widget.WidgetSpec
import com.lsy.composewidget.widget.WidgetState
import com.lsy.composewidget.widget.hlmanager.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWidgetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var state by remember {
                        mutableStateOf<WidgetState>(WidgetState.InitState("加载中"))
                    }
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                PrimaryButton(
                                    "移动端大按钮",
                                    buttonSpec = WidgetSpec.Large,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                PrimaryButton(
                                    "移动端中按钮",
                                    buttonSpec = WidgetSpec.Medium,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                PrimaryButton(
                                    "小按钮",
                                    buttonSpec = WidgetSpec.Small,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                WarningButton(
                                    "移动端大按钮",
                                    buttonSpec = WidgetSpec.Large,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                WarningButton(
                                    "移动端中按钮",
                                    buttonSpec = WidgetSpec.Medium,
                                    buttonState = state,
                                    iconId = R.mipmap.icon_add,
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                WarningButton(
                                    "小按钮",
                                    buttonSpec = WidgetSpec.Small,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                MinorButton(
                                    "移动端大按钮",
                                    buttonSpec = WidgetSpec.Large,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                MinorButton(
                                    "移动端中按钮",
                                    buttonSpec = WidgetSpec.Medium,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                MinorButton(
                                    "小按钮",
                                    buttonSpec = WidgetSpec.Small,
                                    buttonState = state
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                CustomTextButton(
                                    "移动端大按钮",
                                    buttonSpec = WidgetSpec.Large,
                                    buttonState = state,
                                    buttonColors = ButtonModel.textColorButton(
                                        buttonTxtColors = ButtonTxtColors(
                                            PrimaryColor, PrimaryColor500,
                                            PrimaryColor
                                        )
                                    )

                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                                CustomTextButton(
                                    "移动端中按钮",
                                    buttonSpec = WidgetSpec.Medium,
                                    buttonState = state,
                                    buttonColors = ButtonModel.textColorButton(
                                        buttonTxtColors = ButtonTxtColors(
                                            PrimaryColor, PrimaryColor500,
                                            PrimaryColor
                                        )
                                    )
                                ) {
                                    state = when (state) {
                                        is WidgetState.InitState -> WidgetState.EnableState
                                        is WidgetState.EnableState -> WidgetState.DisableState
                                        else -> WidgetState.InitState()
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}