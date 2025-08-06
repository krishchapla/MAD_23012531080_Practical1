fun main(){
    print("Enter Number:")
    var a:Int= readLine()!!.toInt()
    if(a%2==0){
        print("$a is even")
    }
    else{
        print("$a is odd")
    }
}