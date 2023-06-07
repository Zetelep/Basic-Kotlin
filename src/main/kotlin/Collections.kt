fun main(){
     //List//
    /*
    list is a collection of items with a specific order
    list are immutable
    list can be mutable, use mutableListOf
     */
    val numberList:List<Int> = listOf(1,2,3,4)


    //Set//
    /*
    Set is a collection of item that only has unique item
    e.g 1,2,3,4,2,3 -> output: 1,2,3,4
    index 5&6 will not included because of duplicate
    Mutable set can only add or delete item but not changing value on the set like mutable list
     */
    val numberSet = setOf<Int>(1,2,3,4,5,1,2)
    println(numberSet) //1,2,3,4,5
    /*
    Set has (in), so we can check a value is inside the set or not
    Set also has (union) to combine two set, and (intersact) to make a set
    that has set of elements that are in both set
     */
    println(1 in numberSet) //true
    val numberSet2 = setOf<Int>(6,7,3,4)
    val union = numberSet.union(numberSet2) // 1,2,3,4,5,6,7
    val intersact = numberSet.intersect(numberSet2) //3,4


    //Map//
    //Map is a collection of item that has format key-value//
    val numberMap = mapOf<Int,String>(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )
    print(numberMap.values) // One, two, Three
    print(numberMap.keys) // 1, 2, 3



    //Collections Operations//
    /*
    filter() and filterNot() used to make a new list
    with the condition we create
     */
    val intList = listOf<Int>(1,2,3,4)
    val EvenList = intList.filter { it % 2==0 } // 2,4
    val oddList = intList.filterNot { it % 2==0 } //1,3

    /*
    map{} used to make a new collections with a change we need
    for example, use map{} when we need a new collection
    but the item +2 from existed collection
     */
    val plus2IntList =intList.map {it + 2 } //3,4,5,6

    /*
    count() is used to check how many item in collections
     */
    println(intList.count()) // 4

    /*
    find() used to find a item with a condition we need
    but find() immediately return a value if condition meet
    e.g list = 1,2,3,4,5
    find(list>=2) -> output: 2
     */
    val oplist = listOf(1,2,3,4)
    println(oplist.find {it%2==0}) //2

    /*
    first() & last() used to check  the first or last item that meet the condition
    but if condition are false, it will return a exception thread
    use firstOrNull() or lastOrNull() to avoid this
    first() is the same as find()
     */
    println(oplist.first {it%2 ==0 }) //2
    println(oplist.last {it%2==0 })//4

    /*
    sum() is a function to total all data from collection with Integer data types
    sorted() is a function to sort the data ascended
    use sortedDescending() to sort the data descended
     */
    println(oplist.sum()) //10
    println(oplist.sortedDescending()) // 4,3,2,1
}