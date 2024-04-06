fun main(args: Array<String>) {
    println("What's your name?")
    var hey = Name();
    hey.name = readLine().toString()
    println("Your name is ${hey.name}!")
    println("what's your favourite food?")
    hey.food = readLine().toString()
    println("Your favourite food is ${hey.food}!")

}