package com.danachury.samples

import kotlin.math.abs
import kotlin.math.cos

class MathOperators {

    companion object {

        private const val EPS = 1E-10;

        tailrec fun findFixPoint(x: Double = 1.0): Double =
            if (abs(x - cos(x)) > EPS) x
            else findFixPoint(cos(x))
    }
}

fun main() {
    val found = MathOperators.findFixPoint(4.8)
    println(found)
}
