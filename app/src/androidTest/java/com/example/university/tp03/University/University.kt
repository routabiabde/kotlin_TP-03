package com.example.university.tp03.University

class University (
    var nomUni:String,
    var anneeFondation:Int,
    var students: ArrayList<Student> = ArrayList<Student>(),
    var professors :ArrayList<Professor> =  ArrayList<Professor>(),
    ) {
    fun hire(P: Professor){
        professors.add(P)
    }

    fun enroll(S: Student){
        students.add(S)
        println(students.toString())
    }

    override fun toString(): String {
        return "nom : $nomUni ; anneFondation : $anneeFondation"
    }
}