package com.example.university.tp03.University.ex02

import com.example.university.tp03.University.Student

data class exercices (
    private final var name:String,
    private final var age:Int
){}

fun main(){
    var name:String = "abderrahmane Routabi"
    println(name.deletFirstAndLast())
//    var list : MutableList<Int> = mutableListOf<Int>(1,2,4,5,6,7)
//    list.echhange(2,5)
//    println(list)
//    var c1 = Cercle(7)
//    println(c1.calculePerimetre())

}
fun String.deletFirstAndLast():String{
   return this.substring(1,this.length-1)
}

    fun <T> MutableList<T>.echhange(a:Int, b:Int){
             var x = this[a]
             this[a] = this[b]
             this[b]=x
    }

class Cercle(var diametre:Int){}

fun Cercle.calculePerimetre():Double{
    var res =  diametre*Math.PI
    return res
}


