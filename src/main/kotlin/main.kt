fun main() {
    /*1: Drawing a Right-Angled Triangle
        Write a Kotlin program that draws a right-angled triangle of stars with a height of 5.*/
    println("Drawing a Right-Angled Triangle")
    for (line in 0 until 5) {
        for (j in 0..line) {
            print("*")
        }
        println()
    }
    println()


    /*2: Drawing an Isosceles Triangle
        Write a Kotlin program that draws an isosceles triangle of stars with a height of 5.*/
    println("Drawing an isosceles triangle")
    for (line in 1..5) {

        for (space in (4 - line) * 2 downTo 0) {
            print(" ")
        }
        for (star in 1..(line * 2 - 1)) {
            print("* ")
        }

        println()
    }
    println()


    /*3: Drawing a Pyramid
        Write a Kotlin program that draws a pyramid of stars with a height of 5.*/
    println("Drawing an isosceles triangle")
    for (line in 1..5) {

        for (space in (4 - line) downTo 0) {
            print(" ")
        }
        for (star in 1..(line * 2 - 1)) {
            print("*")
        }

        println()
    }
    println()


    /* 4: Counting Vowels in a String
    Write a Kotlin program that counts the number of vowels (a, e, i, o, u) in the string "Kotlin is awesome"*/
    println("Counting Vowels in a string")
    var string = "Kotlin is awesome"
    var countVowels = 0
    for (char in string) {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            countVowels++
        }
    }
    println("Number of Vowels :$countVowels")
    println()


    /*5: Reversing a String
    Write a Kotlin program that reverses the string "Kotlin"*/
    println("Reversing a String")
    var str = "Kotlin"
    var reversedStr = str.reversed()
    println("Reversed: $reversedStr")
    println()


    /*6: Filtering Digits from a String
        Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".*/
    println("Filtering digit from a String")
    var stringWithDigit = "K0t1l1n 2s 4w3s0m3"
    var filterDigit = ""
    for (char in stringWithDigit) {
        if (char.isDigit()) {
            filterDigit += char
        }
    }
    println("Digits: $filterDigit")
    println()


    /*7: Splitting a String into Words
        Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.*/
    println("Spliting a string into words")
    var stringWords = "Kotlin is a great language"
    var word = ""
    for (char in stringWords) {
        if (char != ' ') {
            word += char
        } else {
            println("Word: $word")
            word = ""
        }

    }
    if (word != " ") {
        println("word: $word")
    }
    println()


    /*8: Counting Words in a String
        Write a Kotlin program that counts the number of words in the string "Kotlin is a great language".*/
    println("counting words in string")
    var countWords = 0
    for (char in stringWords) {
        if (char != ' ') {
            word += char
        } else {
            countWords++
        }
    }
    println("Number of words: ${countWords + 1}")//number spaces +1
    println()


    /*9: Removing Spaces from a String
Write a Kotlin program that removes all spaces from the string "Kotlin is fun" and prints the result*/
    println("Removing spaces from string ")
    var stringWithSpaces = "Kotlin is fun"
    var stringWithoutSpaces = ""
    for (char in stringWithSpaces) {
        if (char != ' ') {
            stringWithoutSpaces += char
        }
    }
    println("Text without spaces $stringWithoutSpaces")


}