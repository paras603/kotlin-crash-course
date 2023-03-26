fun main() {
    val list = listOf("Kotlin","is","fun")
    val count = list.customCount{
        currentString -> currentString.length >= 3
    }
    println(count)
}

fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}

fun evenOrOdd(){
    val x = 2
    if (x == 0 ){
        println("The number is zero")
    }else if ((x % 2) == 0){
        println("The number is even")
    }else{
        println("The number is odd")
    }
}

fun isEven(number: Int = 10): Boolean{
    return number % 2 == 0
}

fun Int.isOdd(): Boolean{
    return this % 2 == 1
}