package com.danachury.samples

open class Dog {

    open fun sayHello() {
        println("Wow wow!")
    }
}

class Yorkshire : Dog() {

    override fun sayHello() {
        println("Wif Wif!")
    }
}

fun main() {
    Yorkshire().sayHello()
}
