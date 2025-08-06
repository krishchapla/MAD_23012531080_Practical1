
fun main(){
    val a=arrayOf(2,3,1,4,2,3)
    println(a.contentToString())
    val b=  Array(4){0}
    println(b.contentToString())
    val c = Array(5){ it: Int ->it + 1}
    println(c.contentToString())
    val d= intArrayOf(1,2,3,4,2)
    println(d.contentToString())
    val e=IntArray(5){9;2;32;31}
    println(e.contentToString())
    val f = arrayOf(arrayOf(1,23,32,2), arrayOf(23,21,32,21),arrayOf(22,33,21,34))
    println(f.contentDeepToString())
    val g=arrayOf(intArrayOf(12,32),intArrayOf(34,21), intArrayOf(21,32))
    println(g.contentDeepToString())

        print("Enter the size of the array: ")
        val n = readln().toInt()
        val arr = IntArray(n)
        println("\n--- Enter array elements ---")
        for (i in 0 until n) {
            print("Element [$i]: ")
            arr[i] = readln().toInt()
        }
        println("\n--- Print using forEach ---")
        arr.forEach { print("$it ") }
        println("\n\n--- Print using indices ---")
        for (i in arr.indices) {
            println("arr[$i] = ${arr[i]}")
        }
        println("\n--- Print in reverse using downTo ---")
        for (i in n - 1 downTo 0) {
            print("${arr[i]} ")
        }
        println("\n\n--- Print every second element using step ---")
        for (i in 0 until n step 2) {
            print("${arr[i]} ")
        }
        println("\n\n--- Print using joinToString() ---")
        println(arr.joinToString(", "))
    println(a.sorted().joinToString(", "))
    println(Sort(a).joinToString(", "))



}

fun Sort(arr: Array<Int>): Array<Int> {
    for (i in arr.indices) {
            for (j in i + 1 until arr.size) if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
    }
    return arr
}