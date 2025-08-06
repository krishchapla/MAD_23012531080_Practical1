fun main() {
    print("Enrollment Number: ")
    var a = readLine()!!.toLong()
    print("Student name:")
    var b= readLine()!!.toString()
    print("Student Branch:")
    var c = readLine()!!.toString()
    print("Student class:")
    var d = readLine()!!.toString()
    print("Student Batch:")
    var e: String?= readLine()!!.toString()
    print("College name:")
    var f: String?= readLine()!!.toString()
    print("Univerity name:")
    var g: String?= readLine()!!.toString()
    print("Age:")
    var h:Int= readLine()!!.toInt()

    println("****************************")

    println("Student's data: \n Enrollment no: $a \n Student name: $b \n Student branch: $c \n Student class: $d \n Student Batch: $e \n College name : $f \n University name: $g \n Age : $h \n ")


}