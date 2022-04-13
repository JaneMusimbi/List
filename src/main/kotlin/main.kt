fun main(){

     names(listOf("Jane","Caro","Juliet","Mercy","Sabdio","Lona","Laura","Sharon","Vivian","Nora"))
    var m= height(listOf(7.5,5.0,4.00,8.5))
    println(m )
    var p=person("Jane",32,6.0,56.0)
    var v=person("Musimbi",16,4.3,63.0)
    var b=person("Bakhita",24,4.5,58.5)
    var list= listOf(p,v,b)
    var sorted=list.sortedByDescending { person-> person.age }
    println(sorted)
    var q=person("John",32,3.8,48.0)
    var z=person("Nancy",14,5.0,52.0)
    var list2=listOf(q,z)
    println(sorted.plus (list2))
    var Toyota=car("KDD4567",200)
    var Nissan=car("KBC3465",100)
    var car=listOf(Toyota,Nissan)
    println (mycar(car))



}
fun names(name:List<String>):List<String>{
    name.forEachIndexed{index ,names->
        if ((index%2)==0){
            println(names)
            }


    }
    return name
}
fun height(heightInMetres:List<Double>):String{
    var m= heightInMetres.sum()
    var t=heightInMetres.average()
    var v="total is $m average is $t"
    return v


}
 data class person(var name:String,var age:Int, var height:Double,var weight:Double){

    fun add(name:List<Any>):List<Any>{
        return listOf()
    }
}
data class car(var registration:String, var mileage:Int)
 fun mycar(cars:List<car>):Int{
     var car=0
     cars.forEach {k-> k.mileage
         car+=k.mileage

     }
var average=car/cars.count()
     return average
 }









