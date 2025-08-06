fun main() {
    print("Enter size: ")
    val n = readLine()!!.toInt()

    println("Enter $n numbers separated by space:")
    val input = readLine()!!


    val arr = input.split(" ").map { it.toInt() }.toIntArray()


    val result = max(arr)
    println("Maximum element: $result")
}


fun max(arr: IntArray): Int {
    var max = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }
    return max
}
