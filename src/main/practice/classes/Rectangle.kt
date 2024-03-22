package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 March 2024
 * EMAIL: damexxey94@gmail.com
 */
class Rectangle(
    private val length: Double,
    private val breadth: Double,
) {

    init {
        println("Rectangle created with length of $length and breadth of $breadth")
    }

    fun area() = length * breadth

    fun perimeter() = 2 * (length.plus(breadth))

    fun isSquare() = length == breadth

}