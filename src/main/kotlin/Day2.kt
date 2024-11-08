private fun one() {
    // Find the average of all elements in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)

    var sum = 0
    for (i in arr.indices) {
        sum += arr[i]
    }
    val avr = sum.toDouble() / arr.size

    println("Que.1-> $avr")
}

private fun two() {
    // Find the sum of all even elements in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)

    var sum = 0
    for (i in arr.indices) {
        sum += arr[i]
    }
    println("Que.2-> $sum")
}

private fun three() {
    // Find the number of elements greater than 5 in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    var count = 0
    for (element in arr) {
        if (element > 5)
            count += 1
    }
    println("Que.3-> $count")
}

private fun four() {
    // Find the index of the largest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 9, 2, 6, 7, 8, 3)
    var largestElement = arr[1]
    var indexOfLargestElement = 0
    for (i in arr.indices) {
        if (largestElement < arr[i]) {
            largestElement = arr[i]
            indexOfLargestElement = i
        }
    }
    println("Que.4-> $indexOfLargestElement")
}

private fun five() {
    // Find the index of the smallest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 9, 2, 6, 7, 8, 3)
    var smallestElement = arr[1]
    var indexOfSmallestElement = 0
    for (i in arr.indices) {
        if (smallestElement > arr[i]) {
            smallestElement = arr[i]
            indexOfSmallestElement = i
        }
    }
    println("Que.5-> $indexOfSmallestElement")
}

private fun six() {
    // Check if all elements in the array are positive.
    val arr = intArrayOf(1, 4, 3, 8, 5, 9, 2, 6, 7, 8, 3)
    var positive = false
    for (element in arr) {
        if (element > 0){
            positive = true
        }
    }
    println("Que.5-> ")
}

private fun main() {
    one()
    two()
    three()
    four()
    five()

}