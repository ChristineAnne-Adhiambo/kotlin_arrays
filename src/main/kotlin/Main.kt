fun main(){
arr()
    names()
    grammar()


}
//Question 1

fun arr() {
    var mini = arrayOf("Danny", "Star", "Bree", "Faith")
    println(mini.contentToString())
}
//Question2
fun grammar(){
    var city = arrayOf("harare", "mumbai", "dodoma","jakarta")
    println("harare".capitalize())
    println("mumbai".capitalize())
    println("dodoma".capitalize())
    println("jakarta".capitalize())
}

///Question 3
fun names(){
    var cities = arrayOf(32, 17, 4,213,78,43,90,31,3,73,11,158,62)
    println(cities[1] + cities[5])
    println(cities.indexOf(158))
    println(cities.sortedArray().contentToString())
}
// Question 4
fun ret(name1: String,name2:String, name3:String): String{
    var  jina = arrayOf(name1,name2,name3)
    return jina.contentToString()

}
