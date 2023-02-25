package Examens
open class Exam {

    public fun Matem():Int{
        var ocenka:Int=0
        println("(−8)+4=")
        var q1:Int= readln().toInt()
        if(q1==-4)ocenka=ocenka+1
        println("Чему равна сумма углов треугольника? (Ответ в градусах)")
        q1= readln().toInt()
        if(q1==180)ocenka=ocenka+1
        println("1/20 - это сколько процентов?")
        q1= readln().toInt()
        if(q1==5)ocenka=ocenka+1
        println("6 в третьей степени – это сколько?")
        q1= readln().toInt()
        if(q1==216)ocenka=ocenka+1
        println("Округлите 26,58 до целых.")
        q1= readln().toInt()
        if(q1==27)ocenka=ocenka+1
        return ocenka
    }

    public fun Program():Int{
        var ocenka:Int=0
        println("в каком году появилось программирование")
        var q1:Int= readln().toInt()
        var q2:String
        if(q1==1843)ocenka=ocenka+1
        println("в каком году появился интернет")
        q1= readln().toInt()
        if(q1==1969)ocenka=ocenka+1
        println("самый первый язык программирования")
        q2= readln().toString().lowercase()
        if(q2=="shortcode")ocenka=ocenka+1
        println("Какой язык программирования придумал Никлаус Вирт?")
        q2= readln().toString().lowercase()
        if(q2=="pascal"||q2=="паскаль")ocenka=ocenka+1
        println("Самый популярный язык программирования?")
        q2= readln().toString().lowercase()
        if(q2=="java")ocenka=ocenka+1
        return ocenka
    }

    public fun Biologia():Int{
        var ocenka:Int=0
        println("Против какой болезни в 1796 году Эдвард Дженнер разработал вакцинацию?")
        var q1:Int
        var q2:String= readln().toString().lowercase()
        if(q2=="оспа")ocenka=ocenka+1
        println("Какое количество хромосом должно быть в норме у каждого из нас?")
        q1= readln().toInt()
        if(q1==46)ocenka=ocenka+1
        println("Как называется наука о клетке?")
        q2= readln().toString().lowercase()
        if(q2=="цитология")ocenka=ocenka+1
        println("Какой термин используется для определения древних людей?")
        q2= readln().toString().lowercase()
        if(q2=="неандертальцы")ocenka=ocenka+1
        println("Сколько царств есть в биологии?")
        q1= readln().toInt()
        if(q1==4)ocenka=ocenka+1
        return ocenka
    }

    public fun Obshestvo():Int{
        var ocenka:Int=0
        println("Какой ценз существует в РФ для кандидата на пост Президента РФ на президентских выборах?")
        var q1:Int
        var q2:String= readln().toString().lowercase()
        if(q2=="оседлости")ocenka=ocenka+1
        println("Президент РФ федеральные законы (что делает?):")
        q2= readln().toString().lowercase()
        if(q2=="подписывает")ocenka=ocenka+1
        println("К полномочиям Правительства РФ не относится:")
        q2= readln().toString().lowercase()
        if(q2=="принятие законов")ocenka=ocenka+1
        println("Отрешение Президента РФ от должности находится в ведении:")
        q2= readln().toString().lowercase()
        if(q2=="совета федерации")ocenka=ocenka+1
        println("Во всех случаях, когда президент РФ не в состоянии выполнять свои обязанности, их временно исполняет:")
        q2= readln().toString().lowercase()
        if(q2=="председатель правительства")ocenka=ocenka+1
        return ocenka
    }

}