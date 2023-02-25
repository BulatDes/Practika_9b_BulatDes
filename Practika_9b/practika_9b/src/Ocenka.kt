package Examens
class Ocenka(var ocenka1: Int ,var ocenka2:Int):Exam() {
    public fun Vyvod():Double{
        var average:Double
        var ocenka:Int=ocenka1+ocenka2
        average=ocenka.toDouble()/2
        return average
    }
}