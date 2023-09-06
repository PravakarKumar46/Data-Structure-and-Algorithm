fun main() {

    // var variableName = String() ->Creating an empty String:

    // var variableName = "pravakar"

    // println(variableName)
    // println(variableName.length)

    // Kotlin program to access the elements of a string –

    // 1.Using index: Returns the character at specified index.
    // 2.Using get function: Returns the character at specified index passed as argument to get
    // function.
    // 3.Iterating over the String: Using loops to access the characters in the String.

    // var str = "pravakar"
    // println(str)
    // println(str[0])
    // println(str.get(1))

    // accessing the string elements using for loop
    // for (i in variableName.indices) {
    //     print("${variableName[i]} ")
    // }

    // subSequence(start, end):Returns a substring starting from start and ending at end but
    // excluding end.

    // println(variableName.subSequence(1, 6))

    // str.compareTo(string): Returns 0 if str == string.

    // var str = "pravakar"

    // println(str == variableName)
    // println(variableName.compareTo(str))
    // println(variableName.contentEquals(str))

    // Escaped String Escaped string is declared with double quotes (“….”)
    // and it may contain escape characters like /n, /t etc.

    // escaped string
    // val str = "World \n is \n amazing"
    // println(str)

    //     Raw String – Multi-line String
    // Raw string is placed inside the triple quotes (“””….”””)
    // and it does not have escape characters.
    // It provides the facility of writing the string into multiple lines so it is also called
    // multi-line string.

    // raw string - multiline string
    var str = """My
   |name
   |is
   |Yash
""".trimMargin()
    println(str)

    // \” : for double quote
    // \r : for carriage return
    // \n : for newline
    // \’ : for single quote
    // \\ : for backslash
    // \t : for tab
    // \b : for backspace

    var a = "pravakar"
    var b = "pravakar"
    println(a != b) // false

    var strr = """My
                  |name
                  |is
                  |pravakar
                  |kumar
              """.trimMargin()
            println(strr)
}
