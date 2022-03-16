
fun main(){
var result = product(arrayOf(3,5,2))
    println(result)
    var output = mixedArray(arrayOf(6,7.8F,"vote",9.8,56))
    println(output)
    var sum = arrayOfcharacter(arrayOf('a','g','f','e','k','i','o','u'))
println(sum)
}
fun product(numbers: Array<Int>):Int{
   var num = 1
   numbers.forEach { element ->
       num*=element
   }
return num
}
fun mixedArray(mixed: Array<Any>): Double{
    var x = 0.00
    mixed.forEach { number ->
        if (number is Double || number  is Float)
            x+=number.toString().toDouble()

    }
    return x

}
fun arrayOfcharacter(vowels: Array<Char>):Int{
var vowel = 0
    vowels.forEach { letter ->
        if (letter=='a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u')
            vowel++
    }
    return vowel

}



