fun main() {
    println("Olá, mundo!") // Texto devem estar sempre entre aspas. São chamados de "String"

    var nome = "Parisotto" // var indica uma variável que pode conter textos, valores númericos, boleanos...

    println("Olá, " + nome)

    nome = "Edson"

    println("Oi, ${nome}")
    println("Olá, $nome")

    val PI = 3.14159

    var byte: Byte = 127 // 8 bits - 1 byte
    var short: Short = 30000 // 16 bits - 2 bytes
    var inteiro: Int = 999999999 // 32 bits - 4 bytes
    var longo: Long = 999999999999999999L // 64 bits - 8 bytes

    var float: Float = 1.2f // 32 bits
    var double: Double = 3.14 // 64 bits

    var boleano = false // ou false
    var string = "Kotlin" // texto
    var caracter = '9' // 16 bits

    print("Double MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")

    println(inteiro::class)
    println(longo::class)
    println(boleano::class)
    println(caracter::class)
    println(string::class)

    if (boleano) {
        string = "ok"
        boleano = false
    } else {
        string = "não"
        boleano = true
    }

    var tamanho = if (string.length != null) string.length else 0
    tamanho = string?.length ?: 0

    var tamanho2: Int = 0
    tamanho2 = string?.length!!

    println(string)

}

fun teste(): String {
    return "ok"
}

fun teste2() = println()
