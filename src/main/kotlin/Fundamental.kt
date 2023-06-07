

fun main(){

    //Variable initialization//
    var Cars:String = "Volvo"

    /*
    var-> can change the variable inside
    val ->final
    */

    var chars:Char = 'A'
    /*
    println(chars++) -> output 'A'
    println(chars++) -> output 'B'

    char data types can use increment or decrement
    */

    val text:String = "Kotlin"
    //println("I hecking love $text")-> i hecking love Kotlin
    //format $ can be used to call a variable
    val ages = 10
    print("Your ${if (ages>18)"Passed" else "wait"}")
    // format $ also can use expression inside them using {}


    val line:String = """
        "Line 1\n"+
        "Line 2\n"+
        "Line 3\n"
    """.trimIndent()
    /*
    output:
        Line 1
        Line 2
        Line 3
     */


    //Defining Functions//
    fun SetUser(name:String, age:Int):String{
        return "$name and $age"
    }
    /*
    fun functionName(param1..:Type,param2..:Type):ReturnType{
    inside funtions..
    }
    return type is optional
     */

    //Conditional//
    val grade = 80
    val passing = if (grade>50){"Pass"}else{"Remedy"}
    val Remedy = grade<50
    /*
    print(passing) -> Pass
    print(Remedy) -> false
    Kotlin doesn't support tenary, also f tenary anyway
     */

    //Data Types Convert//
    val stringNumber = "12"
    val ConvertString = stringNumber.toInt() // "12" -> 12
    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    //Defining an Array//
    val array = arrayOf(1,2,"Kotlin",'A')
    val intarray = intArrayOf(1,2,3,4)
    //[datatype]ArrayOf() for array that have object with same data type


    //Null things//
    val textnull:String? = null
    val textlenth = textnull?.length?: -1 //elvis operator
    /*
    if work with null, use safe call (?.) instead of (.) to avoid NullPointerException

    elvis operator used for initialization default value for null object
    textnull?.length?: -1
    equal
    if(textnull != null) text.length else -1
     */
}

