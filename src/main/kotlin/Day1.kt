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

private fun three() {
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    // Print the third element of the array.
    println("Que.3-> " + arr[2])
}

private fun four() {
    // Change the value of the second element to 5.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    arr[1] = 5
    println("Que.4-> " + arr.contentToString())
}

private fun five() {
    // Print all elements of the array using a loop.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    print("Que.5-> ")
    for (j in arr) {
        print("$j ")
    }
    println()
}

private fun six() {
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

private fun seven() {
    // Find the largest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
//    val largest = arr.maxOrNull()
    var largest = arr[0]
    for (i in arr.indices)
        if (largest < arr[i])
            largest = arr[i]
    println("Que.7-> The largest element in the array: $largest")
}

private fun eight() {
    // Find the smallest element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
//    val smallest = arr.minOrNull()
    var smallest = arr[0]
    for (i in arr.indices)
        if (smallest > arr[i])
            smallest = arr[i]
    println("Que.8-> The smallest element in the array: $smallest")
}

private fun nine() {
    // Double the value of each element in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    print("Que.9-> ")
    for (i in arr.indices) {
        arr[i] = 2 * arr[i]
    }
    println(arr.contentToString())
}

private fun ten() {
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

private fun eleven() {
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

private fun twelve() {
    // Replace all occurrences of 3 with 0 in the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in arr.indices) {
        if (arr[i] == 3) {
            arr[i] = 0
        }
    }
    println("Que.12-> " + arr.contentToString())
}

private fun thirteen() {
    // Remove the first element of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = IntArray(arr.size - 1)
    for (i in 1 until arr.size){
        newArr[i-1] = arr[i]
    }
    println("Que thirteen.1-> " + newArr.contentToString())

    // Shift left and zero out the last element
    for (i in 0 until arr.size - 1) {
        arr[i] = arr[i + 1]
    }
    arr[arr.size - 1] = 0
    println("Que thirteen.2-> " + arr.contentToString())
}

private fun fourteen() {
    // Add a new element with the value 8 to the end of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = IntArray(arr.size+1)
    for (i in arr.indices){
        newArr[i] = arr[i]
    }
    newArr[newArr.size-1] = 8
    println("Que fourteen-> " + newArr.contentToString())
}

private fun fifteen() {
    // Sort the array in ascending order.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in arr.indices){
        for (j in 0 until arr.size-1-i){
            if (arr[j]>arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    arr.sort()
    println("Que fifteen-> " + arr.contentToString())
}

private fun sixteen() {
    // Create a copy of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    val newArr = IntArray(arr.size)
    for (i in arr.indices) {
        newArr[i] = arr[i]
    }
    println("Que sixteen-> " + newArr.contentToString())
}

private fun seventeen() {
    // Clear all elements of the array.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in arr.indices) {
        arr[i] = 0
    }
    // by using in build function.
//    Arrays.fill(arr, 0)
    println("Que seventeen-> " + arr.contentToString())
}

private fun eighteen() {
    // Check if the array is empty.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    if (arr.isNotEmpty()) {
        println("Que eighteen-> Array is not empty")
    } else {
        println("Que eighteen-> Array is not empty")
    }
}

private fun nineteen() {
    // Find the index of the element with the value 5.
    val arr = intArrayOf(1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9)
    for (i in arr.indices) {
        if (arr[i] == 5) {
            println("Que nineteen-> Index of 5 is: $i")
        }
    }
}

private fun twenty() {
    // Concatenate two arrays into a new array.
    val a = intArrayOf(1, 4, 3, 8, 5, 2)
    val b = intArrayOf(6, 7, 8, 3, 9)
    val c1 = a + b
    println("Que twenty(a)-> " + c1.contentToString())

    val c2 = IntArray(a.size + b.size)

    for (i in a.indices) {
        c2[i] = a[i]
    }
    for (j in b.indices) {
        c2[a.size + j] = b[j]
    }
    println("Que twenty(b)-> " + c2.contentToString())
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
    thirteen()
    fourteen()
    fifteen()
    sixteen()
    seventeen()
    eighteen()
    nineteen()
    twenty()
}