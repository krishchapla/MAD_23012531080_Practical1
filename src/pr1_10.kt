class Car(
   val Name:String,
   val Owner: String,
   val Miles: Int,
   val Original_Price: Int,
   val Current_Price: Int,
    ){
    init{
        println("Creating car class object car1 in Next Line")
        println("Object of class is created and Init is called")
    }
    fun display(){
        println("--------")
        println("Car information: $Name")
        println("Owner : $Owner")
        println("Miles : $Miles")
        println("Original_Price : $Original_Price")
        println("Current_Price : $Current_Price")
    }


}
fun main(){
    val c1 = Car("BMW","Aman",102,100000,99800)
    c1.display()

}