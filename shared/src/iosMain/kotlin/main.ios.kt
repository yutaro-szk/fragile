import androidx.compose.ui.window.ComposeUIViewController

fun FirstViewController(navigationCallBack: () -> Unit) = ComposeUIViewController { FirstScreen(navigationCallBack) }
fun SecondViewController() = ComposeUIViewController { SecondScreen() }
