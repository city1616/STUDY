//
//  test.swift
//  View_Test
//
//  Created by SeungWoo Mun on 2020/07/20.
//  Copyright © 2020 SeungWoo Mun. All rights reserved.
//

import SwiftUI

struct test: View {
    @State private var toggleStatus = true
    var body: some View {
        List() {
            Toggle(isOn: $toggleStatus) {
                Text("Allow Notifications")
            }
        }
    }
}

struct test_Previews: PreviewProvider {
    static var previews: some View {
        test()
    }
}
