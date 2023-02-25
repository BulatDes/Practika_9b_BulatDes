package Examens
open class Fakultet(var fakultet:String){
    var namefak:String=""

    open fun ChooseFak(){
        when(fakultet){
            "информационные технологии"->{
                namefak="Информационные технологии"
            }
            "медицинский"->{
                namefak="Медицинский"
            }

            "юридический"->{
                namefak="Юридический"
            }

            "экономический"->{
                namefak="Экономический"
            }
            else->throw Exception("Извините такого факультета у нас нет")
        }
    }
    open fun Getnamefak():String {
        return namefak
    }
}