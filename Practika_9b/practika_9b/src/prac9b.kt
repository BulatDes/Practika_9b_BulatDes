import Examens.*
fun main(){
    try {
        println("Введите Фио")
        var fio: String = readln().toString()
        println("Введите факультет на который хотите поступить")
        var fak: String = readln().toString().lowercase()
        val Abutur = Fakultet(fak)
        Abutur.ChooseFak()
        println("Вам придется сдать 2 экзамена")
        val Examen = Exam()
        val Prepod = Prepodavatel()
        var ocenka1: Int = 0
        var ocenka2: Int = 0
        when (fak) {
            "информационные технологии" -> {
                ocenka1 = Examen.Matem()
                ocenka2 = Examen.Program()
                println("Преподаватель: ${Prepod.Mat()} Оценка: $ocenka1")
                println("Преподаватель: ${Prepod.Prog()} Оценка: $ocenka2")
            }

            "медицинский" -> {
                ocenka1 = Examen.Matem()
                ocenka2 = Examen.Biologia()
                println("Преподаватель: ${Prepod.Mat()} Оценка: $ocenka1")
                println("Преподаватель: ${Prepod.Bio()} Оценка: $ocenka2")
            }

            "юридический" -> {
                ocenka1 = Examen.Matem()
                ocenka2 = Examen.Obshestvo()
                println("Преподаватель: ${Prepod.Mat()} Оценка: $ocenka1")
                println("Преподаватель: ${Prepod.Obsh()} Оценка: $ocenka2")
            }

            "экономический" -> {
                ocenka1 = Examen.Matem()
                ocenka2 = Examen.Obshestvo()
                println("Преподаватель: ${Prepod.Mat()} Оценка: $ocenka1")
                println("Преподаватель: ${Prepod.Obsh()} Оценка: $ocenka2")
            }
        }
        val AveOcenka = Ocenka(ocenka1, ocenka2)
        var aveocenka: Double = AveOcenka.Vyvod()
        val Abuturient = Abiturient(fio,fak)
        Abuturient.Result(aveocenka)
    }catch (ex:Exception){
        println(ex.message)
    }



}