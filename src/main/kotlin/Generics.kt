// Generic is for adding parameter type when created class or func //

//Generic Class//
// <T> is used to declare generic class, the inside <?> can be anything like <U> or something//
class MyData<T,U>(val firstData: T, val secondData: U){
    fun getData():T =firstData
    fun getSecond():U = secondData
    fun printData() {
        println("First data $firstData, Second data $secondData")
    }
}

class Intro(val name:String){

    //Generic Function//
    fun<T> sayHello(param:T){
        println("hello $param, my nasme is $name")
    }
    fun<U> IntroID(param:U){
        println("$name ID are $param")
    }
}
/*
 * //Generic Constraint//
 * we can limit the data that can be used on a generic parameter type
 */
class Company<T: Intro>(val employee:T)
// this mean object Company can be only used Class Intro or the subclasses

/* //Covariant//
 * it means we can substitute subtype with supertype
 *  using "out" when create the generic parameter type
 */
class Covariant<out T>(val data:T){
    fun data():T{
        return data
    }
}
/* Contravariant
 * vice versa the Covariant
 * Using "in" when create the generic parameter type
 */
class Contravariant<in T>{
    fun sayHello(name:T){
        println("Yp $name")
    }
}

fun main(){
    // make an generic class object//
    val data1: MyData<String,Int> = MyData("Ione",21)
    data1.printData() //-> First data Ione, Second data 21

    val introTest = Intro("Ikaito")
    introTest.sayHello(10) //hello 10, my nasme is Ikaito
    introTest.IntroID("B12")//hello 10, my nasme is Ikaito

    //Covariant test//
    val dataCov:Covariant<String> =Covariant("10")
    val dataCov2:Covariant<Any> = dataCov //If the generic Invariant it will be error, but its covariant

    //contravariant test//
    val ConAny = Contravariant<Any>()
    val conAny2:Contravariant<String> = ConAny //not an error if using contravariant
    conAny2.sayHello("Illya")
}


