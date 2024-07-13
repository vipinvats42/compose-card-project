package com.test.creditcardapp.designcomposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.test.creditcardapp.model.ModelCardInfo

@Composable
fun CreditCard(cardInfo : ModelCardInfo){

    Card(modifier = Modifier.height(200.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
         Image(painter = painterResource(id = cardInfo.backgroundImage)
             , contentDescription = "Visa ",
             modifier = Modifier.fillMaxSize(),
             contentScale = ContentScale.FillBounds
             )
    }
}