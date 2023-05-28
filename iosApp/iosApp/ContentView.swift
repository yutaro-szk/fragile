import UIKit
import SwiftUI
import shared


struct ContentView: View {
    @State private var shouldShowSecondView: Bool = false
    
    var body: some View {
        NavigationView {
            VStack {
                FirstScreenView(navigationCallBack: {
                    shouldShowSecondView.toggle()
                }).ignoresSafeArea(.all, edges: .bottom)
                NavigationLink(destination: SecondScreenView(), isActive:$shouldShowSecondView) {
                    EmptyView()
                }
            }
        }
    }
}



