abstract class Animal(
    val name: String,
    val legCount: Int = 4
) {
    init {
        println("Hello, I am $name")
    }

    abstract fun makeSound()
}