fun main () {

    var school=name("AkiraChix")


    intro("Beth", 23)

    b()

    word("Beth")
    word("Joy")


}

fun  name(a:String) {
    var school="AkiraChix"
    println(school[0])
    println(school[2])
    println(school[3])
}

fun intro(name:String, age:Int) {
    val sentence="Hi, my name is $name and I am $age years old"
    println(sentence)

}

fun b() {
    var me="Beth"
    println(me.length)
}

fun word(word:String) {
    if (word=="Beth") {
        println("That is me")

    }else {
        println("I don't know who that is")
    }

}
