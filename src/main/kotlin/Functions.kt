    //Anatomy function//

private fun sum(A:Int,B:Int):Int{
    return A+B
}
    /*
     private -> functions can't be accessed outside this file
     fun -> keyword to declare function
     sum -> name of the function
     A,B -> parameters
     (para1,para2):Int -> Int means return type are Integer
      return -> a value that return after calling the functions
    */



    //Variable Argument (Vararg)//

fun SumNumbers(vararg num:Int):Int {
    return num.sum()
}
    //val number = sumNumbers(1,2,3,4)
    //print(number) -> 10

    /*
    vararg is used to simplify function if they has parameters with same type
    vararg is an array, so we can call any function from array class

    if you want add an array into vararg use (*arrayName)
    e.g sumNumbers(1,2,3,*ArrayName,4)
    */


    //Extensions Functions//

fun Int.printInt(){
     print(this+2) //this -> Int, they are receiver type
 }
    //10.printInt -> value = 12 (10+2)
