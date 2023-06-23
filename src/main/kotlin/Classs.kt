
open class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val iSMammal: Boolean
    // this called class property//
)
{
    //class function//
    fun eat() {
        println("$name eat something")
    }

    fun run() {
        println("$name moved!")
    }
    //overloading eat methods//
    fun eat(foodNAme: String){
        println("$name eat $foodNAme")
    }
}

class Person (val name: String,var age:Int)
// if an constructor using var, it has default value adn became optional to add
//Extension  Class Properties//
val Person.getInfo: String
     get() = "This person called ${this.name} and ${this.age} years old"

/* Visibility class
 * Public
 * Private
 * Protected
 * Internal
 */

//Inheritances//
class Fish(pName: String, pWeight: Double, pAge: Int, isMammal: Boolean, val fColor:String)
    :Animal(pName,pWeight,pAge,isMammal){
// Class childClass():parentClass(){}
}
fun main(){
    // how to make an object from a class//
    val cat = Animal("kitty",2.0,2,true)
    // val nameObjeect = className(property1, proprty2,..)

    println("${cat.age}") //print the cat age
    cat.eat() //calling eat func ->kitty eat something

    val Harry = Person("Harry", 21)
    Harry.getInfo // his person called Harry and 21 years old


}