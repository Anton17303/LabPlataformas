import org.jetbrains.annotations.TestOnly
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

fun ItemDataTest() {
    private val originalValue: Any = originalValue

    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> {
                when {
                    originalValue % 10 == 0 -> "M10"
                    originalValue % 5 == 0 -> "M5"
                    originalValue % 2 == 0 -> "M2"
                    else -> null
                }
            }
            is Boolean -> if (originalValue) "Verdadero" else "Falso"
            else -> null
        }
    }

    @test
    // Prueba 1: Valor de tipo String
    val item1 = ItemData("Hola")
    println("Type: ${item1.getType()}") // Salida esperada: cadena
    println("Info: ${item1.getInfo()}") // Salida esperada: L4

    @test
    // Prueba 2: Valor de tipo Integer
    val item2 = ItemData(20)
    println("Type: ${item2.getType()}") // Salida esperada: entero
    println("Info: ${item2.getInfo()}") // Salida esperada: M10

   @test
    // Prueba 3: Valor de tipo Boolean
    val item3 = ItemData(true)
    println("Type: ${item3.getType()}") // Salida esperada: booleano
    println("Info: ${item3.getInfo()}") // Salida esperada: Verdadero

    @test
    // Prueba 4: Valor de otro tipo
    val item4 = ItemData(3.14)
    println("Type: ${item4.getType()}") // Salida esperada: null
    println("Info: ${item4.getInfo()}") // Salida esperada: null
}
