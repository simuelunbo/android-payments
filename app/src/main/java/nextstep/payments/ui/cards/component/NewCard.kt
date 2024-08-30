package nextstep.payments.ui.cards.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NewCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(5.dp),
        modifier = modifier
            .size(
                width = 208.dp,
                height = 124.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE5E5E5)
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "addCard",
                modifier = Modifier.align(Alignment.Center),
            )
        }
    }
}

@Preview
@Composable
private fun NewCardPreview() {
    NewCard(
        modifier = Modifier
            .width(208.dp)
            .height(124.dp),
        onClick = {},
    )
}