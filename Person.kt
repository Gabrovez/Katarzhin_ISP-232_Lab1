fun main (){
    print("введите имя пользователя ")
    val name = readln()
    print("введите ваш возраст ")
    val age = readln().toInt()
    print("введите ваш пол ")
    val laminat = readln()
    println("Ваше имя: $name. Ваш возраст: $age. Ваш пол: $laminat ")
    println("Через 5 лет вам будет ${age+5}")

}