package com.test.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.creditcardapp.designcomposables.CreditCard
import com.test.creditcardapp.model.ModelCardInfo
import com.test.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                   DisplayCards()
                }
            }
        }
    }
}
@Composable
fun DisplayCards(){
val cards = listOf(
    ModelCardInfo("1111 2222 3333 4444",
        "Pranshi",
        R.drawable.mastercard,
        R.drawable.cardback1),
    ModelCardInfo("6666 7777 8888 4444",
        "Pranshi tyagi",
        R.drawable.mastercard,
        R.drawable.cardback1),
    ModelCardInfo("9999 6666 2222 1111",
        "Pranshee",
        R.drawable.mastercard,
        R.drawable.cardback1),
    ModelCardInfo("0000 3333 5555 8888",
        "Pranshi ji",
        R.drawable.mastercard,
        R.drawable.cardback4)
)


    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        items(cards) {
           card-> CreditCard(cardInfo = card)
       }
    }
}

