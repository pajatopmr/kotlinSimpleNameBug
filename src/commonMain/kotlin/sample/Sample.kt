package sample

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

interface Human { fun think(): String }

fun showBug(): String? {
    fun start(man: Human) = man.think()

    return start(object: Human {
        val name = this::class.simpleName
        override fun think() = "Thinking really hard! Name == $name"
    })
}

fun hello(): String = "Hello from ${Platform.name}.  Showing bug manifestation: ${showBug()}"

fun main() {
    println(hello())
}
