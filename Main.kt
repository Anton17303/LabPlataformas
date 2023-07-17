fun main() {
    val value1: Any = "Hola"
    val item1 = ItemData(value1)
    println("Type: ${item1.getType()}")
    println("Info: ${item1.getInfo()}")

    val value2: Any = 15
    val item2 = ItemData(value2)
    println("Type: ${item2.getType()}")
    println("Info: ${item2.getInfo()}")

    val value3: Any = true
    val item3 = ItemData(value3)
    println("Type: ${item3.getType()}")
    println("Info: ${item3.getInfo()}")

    val value4: Any = 3.14
    val item4 = ItemData(value4)
    println("Type: ${item4.getType()}")
    println("Info: ${item4.getInfo()}")
}
