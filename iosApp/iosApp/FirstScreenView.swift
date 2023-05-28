import SwiftUI
import shared

struct FirstScreenView: UIViewControllerRepresentable {
    var navigationCallBack: () -> Void
    func makeUIViewController(context: Context) -> UIViewController {
        Main_iosKt.FirstViewController(navigationCallBack: navigationCallBack)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
