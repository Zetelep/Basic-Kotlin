fun main(){
    //Enumeration//
    val redColor:Color = Color.RED
    val blueColor:Color = Color.valueOf("BLUE")
    println(redColor) // -> RED
    println(blueColor.value) //-> value of blue color
    println(blueColor.ordinal) // -> 2, to find position object in enum
    val colors : Array<Color> = Color.values()
    colors.forEach { color -> print("$color ")  } // iterate all object


    //When Expressions//
    val GPA = 3
    val Values = when(GPA){
        1 -> "D"
        2 -> "C"
        3 -> "B"
        4 -> "A"
        else -> {
            print(GPA)
            "Isnt valid"
        }
        // use curly bracket if more line needed
    }
    println("\n$Values")
    /*
    When expression can be used to check the type of object using (is) or (!is)
    Also can check if any value in a range or not using (in) or (!in)
     */

    //While and Do-While Loops//
    var counter = 0
    while (counter<3){
        println("Counter number $counter")
        counter++
    }
    var counter2 = 0
    do{
        println("Counter number $counter2")
        counter2++
    }while (counter<3)

    //Range//

    val rangeInt = 1..10 // 1,2,3,4 til 10 can used rangeTo() insted of (..)
    val rangeInt2 = 1..10 step 2 // 1.3.5.7.9
    val rangeInt3 = 10.downTo(1) step 3 // 10, 7, 4, 1

    /*
    *step used for provide the gap between values, the default is 1
    *to print range use forEach
    *Character can be used in range
    */

    //For Loops//

    val ranges = 1..5
    for(i in ranges){
        println("Value is $i")
    }
    //checking index with for loops
    for((index,value ) in ranges.withIndex()){
        println("Value: $value index: $index")
    }
    // this can be simplified with forEachIndexed
    ranges.forEachIndexed { index, i ->
        println("Value: $i index: $index") }
    // if only index needed to display, change (i) into (_)

}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
    /*
       object inside enum are final/static

     */
}