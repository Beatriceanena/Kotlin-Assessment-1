fun main(){
output()
  var s=remainder(9,2)
    println (s)
   var u= myinitials("Beatrice",20)
    println(u)
    var l=mylength("lovelace")
    println(l)
}
//question 1
fun output(){
    var w= "CodeHive"
    var r= w[4].toString()+w[5]+w[6]+w[7]
    println(r)
}

//question 2
fun remainder(a:Int,b:Int):Int{
    var modulus =a%b
    return modulus
}
//question 3
fun myinitials(p:String, z:Int):String{
    var t= "Hi, my name is $p and I am $z years old "
    return (t)
}
//question 4
fun mylength(v:String):Int{
    var k= v.length
    return k
}