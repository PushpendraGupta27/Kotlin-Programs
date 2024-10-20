private fun one() {
    val a = IntArray(5)
    for (i in a) {
        a[i] = 0
    }
    println("Que.1-> " + a.contentToString())
}

private fun two() {
    // Assign the value 10 to the first element of the array.
    val a = IntArray(5) { 0 }
    a[0] = 10
    println("Que.2-> " + a.contentToString())
}

fun three() {
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    // Print the third element of the array.
    println("Que.3-> " + arr[2])
}

fun four() {
    // Change the value of the second element to 5.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    arr[1] = 5
    println("Que.4-> " + arr.contentToString())
}

fun five() {
    // Print all elements of the array using a loop.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    print("Que.5-> ")
    for (j in arr) {
        print("$j ")
    }
    println()
}

fun six() {
    // Calculate the sum of all elements in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val sum1 = arr.sum()
    var sum2 = 0
    for (i in arr) {
        sum2 += i
    }
    println("Que.6(a)-> Sum of the all elements of Array is: $sum1")
    println("Que.6(b)-> Sum of the all elements of Array is: $sum2")
}

fun seven() {
    // Find the largest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
//    val largest = arr.maxOrNull()
    var largest = arr[0]
    for (i in arr.indices)
        if (largest < arr[i])
            largest = arr[i]
    println("Que.7-> The largest element in the array: $largest")
}

fun eight() {
    // Find the smallest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
//    val smallest = arr.minOrNull()
    var smallest = arr[0]
    for (i in arr.indices)
        if (smallest > arr[i])
            smallest = arr[i]
    println("Que.8-> The smallest element in the array: $smallest")
}

fun nine() {
    // Double the value of each element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    print("Que.9-> ")
    for (i in arr.indices) {
        arr[i] = 2 * arr[i]
    }
    println(arr.contentToString())
}

fun ten() {
    // Reverse the elements of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in 0..<arr.size / 2) {
        val temp = arr[i]
        arr[i] = arr[arr.size - 1 - i]
        arr[arr.size - 1 - i] = temp
    }
    println("Que.10(a)-> " + arr.contentToString())
    // by using in build function
    arr.reverse()
    println("Que.10(b)-> " + arr.contentToString())
}

fun eleven() {
    // Check if the array contains the value 7.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    // Check if the array contains the value 7.
    if (arr.contains(7))
        println("Que.11(a)-> yes the array is contains the value 7.")
    else println("Que.11(a)-> no the array is not contains the value 7.")

    // by using loop
    var isContain = false
    for (i in arr.indices) {
        if (arr[i] == 7)
            isContain = true
    }
    if (isContain) println("Que.11(b)-> yes the array is contains the value 7.")
    else println("Que.11(b)-> no the array is not contains the value 7.")
}

fun twelve() {
    // Replace all occurrences of 3 with 0 in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in arr.indices) {
        if (arr[i] == 3) {
            arr[i] = 0
        }
    }
    println("Que.12-> " + arr.contentToString())
}

fun thirteen() {
    // Remove the first element of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = arr.drop(1).toIntArray()
    println("Que thirteen.1-> " + newArr.contentToString())

    // Shift left and zero out the last element
    val shiftedArr = arr.copyOf()
    for (i in 0 until shiftedArr.size - 1) {
        shiftedArr[i] = shiftedArr[i + 1]
    }
    shiftedArr[shiftedArr.size - 1] = 0
    println("Que thirteen.2-> " + shiftedArr.contentToString())
}

fun fourteen() {
    // Add a new element with the value 8 to the end of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = arr.plus(8)
    println("Que fourteen-> " + newArr.contentToString())
}

fun fifteen() {
    // Sort the array in ascending order.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    arr.sort()
    println("Que fifteen-> " + arr.contentToString())
}

fun sixteen() {
    // Create a copy of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = arr.copyOf()
    println("Que sixteen-> " + newArr.contentToString())
}

fun seventeen() {
    // Clear all elements of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    arr.fill(0)
    println("Que seventeen-> " + arr.contentToString())
}

fun eighteen() {
    // Check if the array is empty.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    if (arr.isNotEmpty()) {
        println("Que eighteen-> Array is not empty")
    } else {
        println("Que eighteen-> Array is empty")
    }
}

fun nineteen() {
    // Find the index of the element with the value 5.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val index = arr.indexOf(5)
    if (index != -1) {
        println("Que nineteen-> Index of 5 is: $index")
    }
}

fun twenty() {
    // Concatenate two arrays into a new array.
    val a = intArrayOf(1, 4, 3, 8, 5, 2)
    val b = intArrayOf(6, 7, 8, 3, 9)
    val c = a + b
    println("Que twenty-> " + c.contentToString())
}

fun main() {
    one()
    two()
    three()
    four()
    five()
    six()
    seven()
    eight()
    nine()
    ten()
    eleven()
    twelve()
}