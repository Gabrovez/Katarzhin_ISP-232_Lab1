//const val  PI = 3.1415
fun main(){ // начало функции main
    //Задание 1
    /*val a = "Library_of_Ruina"
    val b = 11
    val c = 3.14
    val d = "Г"
    println(a)
    println(b)
    println(c)
    println(d)*/
    //Задание 3
    /*val pi = 3.14
    val rad = 5
    println("${pi * rad.toDouble() * rad.toDouble()}")*/
    //Задание 4
    /*val name = readln()
    val age = readln().toInt()
    println("${name} вам ${2025 - age}")*/
    //Задание 5
    /*val n1 = readln().toInt()
    val n2 = readln().toInt()
    println("${n1} + ${n2} = ${n1 + n2}")
    println("${n1} - ${n2} = ${n1 - n2}")
    println("${n1} * ${n2} = ${n1 * n2}")*/
    //Задание 6
    /*val n = readln().toInt()
    val n1 = n / 100
    val n2= n /10 %10
    val n3= n %10
    println("$n → $n1 + $n2 + $n3 = ${n1 + n2 + n3}")*/
    //Задание 7
    /*val m = readln()
    val n1 = readln()
    val n2 = readln()
    val n3 = readln()
    println("$n1$m$n2$m$n3")*/
    //Задание 8
    /*var n = readln().toInt()
    println("$n")
    n++
    println("$n")
    n++
    println("$n")*/
    //Задание 9
    /*val n = readln()
    val rn = n.reversed().toInt()
    println("$rn")*/
    //Задание 10
    /*val n = readln().toInt()
    println("${(n/100)%10}")*/
    //hello world
    //println("Hello world!")
    //Шаг 4. Переменные: val и var
    //val city = "Москва"
    //var temperature = 20
    //temperature += 5
    /*val name = "Grisha"
    val dob = 11112006
    var age = 18
    age += 10
    println(name)
    println(dob)
    println(age)*/
    //Шаг 5. Базовые типы данных
   /* val count : Int= 2
    println(count)
    val odin : Int = 1
    val odinad : Long = 11
    val duble : Double = 0.2
    val plivet : Float = 0.3F
    val da : Boolean = true
    val gg : Char = 'g'
    val ublublub : String = "ublublub"
    val any_1 : Any = 1
    val any_2 : Any = true
    val any_3 : Any = "utrechko"
    println("$odin")
    println("$odinad")
    println("$duble")
    println("$plivet")
    println("$da")
    println("$gg")
    println("$ublublub")
    println("$any_1")
    println("$any_2")
    println("$any_3")*/
    //Шаг 6. Шаблоны строк
    /*val game = "Dota 2"
    val year = 2005
    val message = "$game - пользовательская карта для Warcraft III, разрабатываемая с $year года"
    println(message)*/
    //Шаг 7. Комментарии и упражнение для мозгов
    /* начало многострочного комментария
        многострочный комментарий
        Функция main
        точка входа в программу
    */ //конец многострочного комментария
    /*println("Hello world!") //Вывод строки на консоль
    val name = "Denis" // Объявить переменную с именем 'name' и присвоить ей значение "Denis"
    val age = 18 //объявление переменной возраста и присваивание ей значения
    println("Hello") // вывод приветствия
    println("My name is $name") // вывод имени
    println("My age is $age") // вывод возраста
    val a = 10 //объявление переменной a и присваивание ей значения
    val b = 15 //объявление переменной b и присваивание ей значения
    val c = a + b + 8 // //объявление переменной c и вычисление её значения
    val str = c.toString() // запись переменной с в переменную str с переводом в строку
    println(str) //вывод переменной tr
    val numList = arrayOf(1, 2, 3) // Создание массива целых чисел numList с элементами 1, 2, 3
    var x = 0//объявление переменной x и присваивание ей значения
    while (x < 3) { // Начало цикла. Цикл выполняется пока переменная x меньше 3
        println("Item $x is ${numList[x]}") // Вывод элемента массива с текущим индексом x
        x = x + 1 // Увеличение значения x на 1 для перехода к следующему элементу
    }// конец цикла while*/
    //Шаг 8. Coding conventions
    /*val discount: Double = .20
    var pet = "bird"
    val sum = 1 + 2*/
    //Шаг 9. Преобразование данных
    /*val a: Int = 7
    val b: Double = 3.5
    val bint = b.toInt()
    val sum = a + bint
    val div = a / bint
    println("$sum")
    println("$div")*/
    //Шаг 10. Поиск ошибок: работа с IDE
        /*var x: Int = 65.2.toInt()
        var isPunk: Boolean = true
        var message = "Hello"
    //val n = 10.also { it -> it.also { it1 -> it1.also { isPunk = it } } }
    // у меня не получилось починить эту строку через IDE/ было ISPUNK =10. поэтому я просто присвоил false
    isPunk = false
    var y: String = 15.toString()
        y = "hello$y"*/
    //Шаг 12. Базовые математические операции с целыми числами
    /*val unreadcount = 5
    val readcount = 100
    println("У вас ${unreadcount + readcount} сообщений.")
    print("введите первое число ")
    val a = readln().toInt()
    print("введите второе число ")
    val b = readln().toInt()
    println("Сумма: ${a + b}")
    println("Разность: ${a - b}")
    println("Произведение: ${a * b}")
    println("Частное: ${a / b}")
    println("Остаток: ${a % b}")*/
    //Шаг 13. Инкремент и декремент
    var count: Int = 10
    println(count)


}//конец фукнции main