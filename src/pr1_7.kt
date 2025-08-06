fun facto_rec(n:Int):Int{
    if (n==0||n==1){
        return 1
    }
    else{
        return n*facto_rec(n-1)
    }
}
fun main(){
    print(facto_rec(5))
}