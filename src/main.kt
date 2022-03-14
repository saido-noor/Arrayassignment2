fun main() {
    var total = takeInArray(arrayOf(5,3,6))
    println(total)
    var totals = takeInMixedArray(arrayOf("Omar",2.2F,4.5,20.5,"Umukiza",3.4,10))
    println(totals)

    var characters = takesArrayCharacter(arrayOf('h','e','a','u','o'))
    println(characters)

}

fun takeInArray(products:Array<Int>):Int{
    var product = 1
    products.forEach { num ->
        product*=num

    }
    return product
}

fun takeInMixedArray(mixed:Array<Any>):Double{
    var sum = 0.0
    mixed.forEach { mix ->
        if (mix is Double || mix is Float )
            sum+= mix.toString().toDouble()
    }
    return sum
}

fun takesArrayCharacter(charact:Array<Char>):Int{
    var chara = 0
    charact.forEach { saido ->
        if (saido == 'a' || saido == 'u' || saido == 'e' || saido == 'i' || saido == 'o')
            chara++
    }
    return chara
}