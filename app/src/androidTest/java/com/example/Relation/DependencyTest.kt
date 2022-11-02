package com.example.Relation

//Assocoation -> 연관 관계 나도 상대가 다중 상대도 내가 다중
class Patient(val name: String){
    fun doctoList(d: Doctor){
        println("Patient : $name, Doctor: ${d.name}")
    }
}
class Doctor(val name: String){
    fun patientList(p:Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}
fun main(){
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctoList(doc1)
}