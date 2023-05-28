import androidx.compose.runtime.Composable

@Composable fun FirstScreenView(navigationCallBack: () -> Unit) = FirstScreen(navigationCallBack)
@Composable fun SecondScreenView() = SecondScreen()

