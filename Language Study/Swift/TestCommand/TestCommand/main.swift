//
//  main.swift
//  TestCommand
//
//  Created by SeungWoo Mun on 2020/02/17.
//  Copyright © 2020 SeungWoo Mun. All rights reserved.
//

import Foundation

print("Hello, World!")

var integers: Array<Int> = Array<Int>()
integers.append(1)
integers.append(100)

print(integers)

func sum(a: Int, b: Int) -> Int {
    return a + b
}

func hello() -> Void {
    print("HELLO")
    return
}

func bye() { print("bye") }

func nameprint(name: String) -> Void {
    print("Name is", name)
}

print(sum(a: integers[0], b: integers[1]))
hello()
bye()
nameprint(name: "mark")

//조건문
print("\nif else")
var value: Int = 100
if value > 100 {
    print("100 초과")
}
else if value < 100 {
    print("100 미만")
}
else {
    print("100")
}
print("\nswitch")
switch value {
case 0:
    print("zero")
case 1 ..< 100:
    print("1 ~ 99")
case 100:
    print("100")
case 101 ... Int.max:
    print("over 100")
default :
    print("unknown")
}

print("\nswitch2")
switch "a" {
case "a":
    print("a!")
case "b":
    print("b!")
case "c":
    print("c!")
default :
    print("unknown")
}

func greeting(friend: String, me: String = "Seung") {
    print("Hi \(friend), I'm \(me)!")
}
greeting(friend: "mark")
greeting(friend: "mike", me : "eric")
