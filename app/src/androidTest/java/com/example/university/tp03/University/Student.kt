package com.example.university.tp03.University

import com.example.university.tp03.University.Result

class Student (
    var nomStudent:String,
    var age:Int,
    var numMatricule:Int,
    var CourDesStudent : ArrayList<Cour> = ArrayList<Cour>()
){
 fun enroll(c: Cour){
     CourDesStudent.add(c)
 }
 fun takeExame(c: Cour){
     println("le $nomStudent est pass l'exame dans ${c.nom}")
 }
 var rateSucces= 0
    var checkRat = rateSucces>=0 &&rateSucces<=100

 fun  learn(){
     when(checkRat){
         true -> rateSucces+=2
         else -> "rat Succes is more than 100"
     }
 }
  fun party(){
      when(checkRat){
          true -> rateSucces-=2
          else -> "4 0 4"
      }
  }
  fun isPassed(mark:Int):Boolean{
      return mark>40
  }

  fun grade(){
      println(Result.SUCCES)
  }

}