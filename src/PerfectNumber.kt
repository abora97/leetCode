fun main(){
  println(checkPerfectNumber(28))
  println(checkPerfectNumber(7))
}

 fun checkPerfectNumber(num: Int): Boolean {
        var sum:Long=0
        for(i in 1 .. num-1){
            if(num % i == 0){
                sum=sum +i
            }
        }
        return sum==num.toLong()
    }