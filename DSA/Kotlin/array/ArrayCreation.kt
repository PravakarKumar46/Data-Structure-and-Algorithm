/** Array is class in kotlin */
fun main() {

    // var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "apple")

    // var arr = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // for (i in 0 until arr.size) {

    //     print("${arr[i]} ")

    // Using the Array constructor –

    // val num = Array(3, { i -> i * 1 })

    // for (i in 0..num.size - 1) {
    //     print("${num[i]} ")
    // }

    /**
     * Apart from these, Kotlin also has some built-in factory methods to create arrays of primitive
     * data types, such as byteArray, intArray, shortArray, etc. These classes do not extend the
     * Array class; however, they implement the same methods and properties.
     */
    val num = intArrayOf(1, 2, 3, 4, 5)

    // num.set(2, 10)
    // for (i in 0..num.size - 1) {
    //     print("${num[i]} ")
    // }

    // println()

    // println(num.get(1))
    // println(num[0])

    // Traversing Arrays –

    for (i in num.indices) {

        print("${num[i]} ")
    }

    println()

    // Kotlin program of array traversal using foreach loop->
    val arr = intArrayOf(10, 20, 30, 40, 50)
    arr.forEach { i -> print("$i ") }
}
