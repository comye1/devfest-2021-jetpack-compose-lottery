package app.devfest.composablelottery.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryListUi(lottoNumbers: List<Int>) {

    /**
     * 이 곳은 lottoNumbers 만큼 [app.devfest.composablelottery.ui.LotteryItemUi] 를 표시해줄 부분입니다.
     * lottoNumbers 가 비어있지 않을 때는 "아래 버튼을 눌러 로또 번호를 뽑아주세요!" Text 를 표시합니다.
     * */
    if (lottoNumbers.isEmpty()) {
        Text(text = "아래 버튼을 눌러 로또 번호를 뽑아주세요!", color = MaterialTheme.colors.onBackground)
    } else {
        Row {
            lottoNumbers.forEach {
                LotteryItemUi(lottoNumber = it)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }

}

@Composable
@Preview
fun LotteryListUiPreview() {
    AppTheme {
        LotteryListUi(lottoNumbers = (1..45).shuffled().subList(0, 5))
    }
}