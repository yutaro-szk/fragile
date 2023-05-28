import SwiftUI
import shared

struct SecondScreenView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        Main_iosKt.SecondViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
