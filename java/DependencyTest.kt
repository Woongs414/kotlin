class Patient2(val name: String, var id:Int){
    fun doctorList2(d: Doctor){
        println("Patient: $name, Doctor:${d.name}")
    }
}
class Doctor2(val name: String, val p: Patient2){
    val customerId: Int = p.id

    fun patientList2(){
        println("Doctor: $name, Patient:${p.name}")
        println("Patient Id: $customerId")
    }
}
fun main(){
    val patient3 = Patient2("kildong", 1234)
    val doc2 = Doctor2("kimSabu",patient3)
    doc2.patientList2()
}