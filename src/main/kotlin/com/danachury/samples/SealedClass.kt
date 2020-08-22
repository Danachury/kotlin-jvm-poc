package com.danachury.samples

sealed class Mammal(val name: String)

class Cat(name: String) : Mammal(name)
class Human(name: String, val job: String) : Mammal(name)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Denilson", "Software Engineer")))
}
