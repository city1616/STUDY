//
//  ViewController.swift
//  SampleWebView
//
//  Created by SeungWoo Mun on 2020/02/18.
//  Copyright © 2020 SeungWoo Mun. All rights reserved.
//

import UIKit
import WebKit

class ViewController: UIViewController {

    @IBOutlet weak var WebViewMain: WKWebView!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        // 1. url string
        // 2. url -> request
        // 3. request -> load
        
        let urlString = "https://www.google.com"
        if let url = URL(string: urlString) { // unwrap - 옵셔널 바인딩
            let urlReq = URLRequest(url: url)
            WebViewMain.load(urlReq)
        }
        var abc = "1"
        var abc1: String? = nil
        // Null Pointer Exception - java
        
    }


}

