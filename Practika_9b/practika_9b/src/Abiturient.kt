import Examens.*
class Abiturient(var fio:String,fakultet:String):Fakultet(fakultet) {
     fun Result(aveocenka:Double){
        when(aveocenka){
            in 4.0..5.0->println("Абитуриент $fio зачислен на факультет '${namefak}'")
            else->println("Абитуриент $fio не зачислен")
        }
    }

}