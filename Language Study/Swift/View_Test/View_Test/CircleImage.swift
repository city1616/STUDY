//
//  CircleImage.swift
//  View_Test
//
//  Created by SeungWoo Mun on 2020/07/19.
//  Copyright © 2020 SeungWoo Mun. All rights reserved.
//

import SwiftUI

struct CircleImage: View {
    var body: some View {
        Image("ㅇㅇㅇ")
            .frame(width: 250.0, height: 250.0)
            //.fixedSize(size: 112)
            .clipShape(Circle())
            .overlay(
                Circle().stroke(Color.white, lineWidth: 4))
            .shadow(radius: 10)
    }
}

struct CircleImage_Previews: PreviewProvider {
    static var previews: some View {
        CircleImage()
    }
}
