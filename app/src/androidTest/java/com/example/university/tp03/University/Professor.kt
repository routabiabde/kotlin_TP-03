package com.example.university.tp03.University

import com.example.university.tp03.University.Result

class Professor (
    var nomProf:String,
    var age:Int,
    var Salaier:Int,
    var CourDesProf : ArrayList<Cour>  = ArrayList<Cour>()
){
 fun teach(c: Cour){
     CourDesProf.add(c)
 }
 fun doOralExame(s: Student, c: Cour){
     println(Result.SUCCES)
 }


}
