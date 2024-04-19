package main.practice.classes

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 14 April 2024
 * EMAIL: damexxey94@gmail.com
 */

fun main() {

    var list = (1..20).toList()
    println("Initial list: $list")
    list = list.filter { it > 8 }
    println("Updated list: $list")

    val circle1 = Circle(2.3)
    val rectangle1 = Rectangle(16.3, 34.2)
    val triangle1 = Triangle(13.8, 6.5, 3.5)

    var shapes = listOf(circle1, rectangle1, triangle1)
    shapes = shapes.customFilter { it.area() > 20.0 }
    for (shape in shapes) {
        println("${shape.name}: Area : ${shape.area()}")
    }

    val intList = (1..10).toList()
    println(intList)
    val sum = intList.customSum { it % 2 == 1 }
    println("The sum is: $sum")

    val triple = Triple(1.0, "Hello generics", true)
    println(triple)
    val customTriple = CustomTriple(2.0, "Hello Kotlin", false)
    customTriple.printTypes()

}

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

fun List<Int>.customSum(predicate: (Int) -> Boolean): Int {
    var sum = 0
    for (item in this) {
        if (predicate(item)) {
            sum += item
        }
    }
    return sum
}
