//
//  navi_test.swift
//  View_Test
//
//  Created by SeungWoo Mun on 2020/07/20.
//  Copyright © 2020 SeungWoo Mun. All rights reserved.
//

import SwiftUI

struct TodoItem: Identifiable {
    var id = UUID()
    var task: String
    var imageName: String
}

var listItem: [TodoItem] = [
TodoItem(task: "Take out trash", imageName: "trash.circle.fill"),
TodoItem(task: "Pick up the kids", imageName: "person.2.fill"),
TodoItem(task: "Wash the car", imageName: "car.fill")]

struct navi_test: View {
    @State private var toggleStatus = false
    @State private var wifiEnabled = true
    @State private var userName = ""
    var body: some View {
        NavigationView {
            List {
                Section(header: Text("Settings")) {
                    Toggle(isOn: $toggleStatus) {
                        Text("Allow Notigications")
                    }
                }
                Section(header: Text("Todo task")) {
                    ForEach(listItem) { item in
                        HStack {
                            NavigationLink(destination: Text(item.task)) {
                                Image(systemName: item.imageName)
                                Text(item.task)
                            }
                        }
                    }
                }
                Section(header: Text("Stack")) {
                    VStack {
                        VStack(alignment: .leading) {
                            Text("Text 1")
                            Text("Text 2")
                            MyStackView()
                        }
                    }
                }
                Section(header: Text("WiFi")) {
                    Toggle(isOn: $wifiEnabled) {
                        Text("wifi")
                    }
                    TextField("Enter user name", text: $userName)
                    Text("userName")
//                    Image(systemName: wifiEnabled ? "wifi" : "wifi.slash")
                    Wifi(wifiEnabled: $wifiEnabled)
                }
            }
        .navigationBarTitle("Todo List")
            .navigationBarItems(trailing: Button(action: addTask) {
                Text("Add")
            })
        }
    }
    func addTask() {
        // NavigationLink(<#LocalizedStringKey#>, destination: IU())
        Text("a")
    }
}

struct Wifi: View {
    @Binding var wifiEnabled: Bool // 상태 바인딩
    var body: some View {
        Image(systemName: wifiEnabled ? "wifi" : "wifi.slash")
    }
}

struct MyStackView: View {
    var body: some View {
        HStack(alignment: .top) {
            Text("Text 3")
                .font(.headline)
            Spacer()
            Text("Text 4")
            Spacer()
            Image(systemName: "goforward.30")
        }
    }
}

struct navi_test_Previews: PreviewProvider {
    static var previews: some View {
        navi_test()
    }
}
