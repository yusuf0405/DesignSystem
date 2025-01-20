import androidx.compose.ui.window.ComposeUIViewController
import org.joseph.designsystem.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
