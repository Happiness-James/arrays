
fun main(){
stringArray("cat","dog","cow","gazzel")
    grammatical(arrayOf("harare","mumbai","dodoma","akarta"))
arithmetic()
    var result = arrayOf("Happiness","James","Gesare")
    println(result.contentToString())
}
fun stringArray(name1: String,name2:String,name3: String,name4:String){
    var four = arrayOf(name1,name2,name3,name4)
    println(four.contentToString())
}
fun grammatical(cities: Array<String>){
    cities.forEach { country ->
        println(country.capitalize())
    }
}
fun arithmetic(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    println(numbers[11])
    println(numbers.sortedArray().contentToString())
}
fun names(name: Array<String>):Array<String>{
        return name
    }
