package com.example.university.tp03.University


fun main() {

    var Ensa = University("Ensa",2000)
    var p1 = Professor("Elmehsi Fahmi",23,20000)
    var s1 = Student("Abderrahmane Routabi",18,7373)
    var English = Cour("English")
    Ensa.hire(p1)
    Ensa.enroll(s1)
    p1.teach(English)
    s1.enroll(English)
    s1.party()
    s1.party()
    s1.party()
    s1.learn()
    s1.takeExame(English)
    p1.doOralExame(s1,English)
    println(s1.isExellent(100))
}
fun Student.isExellent(mark:Int):Boolean{
    return mark > 70
}
