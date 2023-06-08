fun main(){


    fun fullname(firstName: String,lastName: String): String{
        return "$firstName $lastName"
    }
    //function above can simplify using lambda

    val lambdaFullName = {firstName: String,lastName: String /*parameter*/ ->
        println("$firstName $lastName") //return
    }

    println(fullname("Shinomiya", "Runa")) // Shinomiya Runa
    lambdaFullName("Aizawa","Ema") // Aizawa Ema

    //Lambda can also declare like this
    val sum: (Int) -> Int = {number -> number+number}
    /*(Int) this mean parameter has Integer types
    -> int means the return type are Integer
     */
   val itLambda: (String) -> String = {it.uppercase()}
    // it can be used if there is only 1 parameter inside lambda


    //Scope Function//

    /*let
     *The context object is available as an argument (it).
     *The return value is the lambda result.
     *let can be used to invoke one or more functions on results of call chains
     */
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)

    //with let
    val numbersWithLet = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    /*with
     *The context object is available as a receiver (this).
     *The return value is the lambda result.
     *"with" can b
     * e read as "with this object, do the following."
     */
    val GP = mutableListOf(1,2,3,4)
    with(GP){
        println("the highest GP is ${this.last()}") //4
    }

    /*Run
     *The context object is available as a receiver (this).
     *The return value is the lambda result.
     *run does the same as with but it is implemented as an extension function.
     *like let, you can call it on the context object using dot notation.
     */
    val RandNum = 2
    val numPlus2 = RandNum.run{
        this+2
    }
    println(numPlus2) //4

    //function references//
    /*
     * using :: we can reference a function
     */
    fun isOddNum(x:Int) =  x%2==0 //function to check odd number
    val ranges = 1..10
    val OddNum = ranges.filter(::isOddNum)
    println(OddNum)//2,4,6,8,10

    //Property references//
    /*
     * also, with :: we can access properties as first-class objects in Kotlin
     */

    val x = 1 //this should be outside the function we references
    //::x.set(2) ->reference the x
    //println(x) -> 2

}