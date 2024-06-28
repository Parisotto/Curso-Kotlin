fun main() {
    println("FUNÇOES")
    println()

    helloWorld()
    helloWorld("Parisotto")
    helloWorld("Parisotto", 61)
    helloWorld("Edson", "masculino")
    helloWorld("Edson Parisotto", 61, 1.78, "masculino")
    helloWorld("Edson Parisotto", 61, 1.78)

    var mensagem = olaMundo()
    println(mensagem)

    println(olaMundo("Edson Parisotto"))

    println()
    println(soma(7, 9))

    println()
    println(multiplica(3, 9))
}

fun helloWorld() {
    println("Hello, World!")
}

fun helloWorld(nome: String) {
    println("Hello, $nome")
}

fun helloWorld(nome: String, idade: Int) {
    println("Olá, $nome. Você tem $idade anos.")
}

fun helloWorld(nome: String, genero: String) {
    println("Oi, $nome. Seu gênero é $genero")
}

fun helloWorld(nome: String, idade: Int, altura: Double, genero: String = "não declarado" ) {
    println("$nome, $idade anos, $altura de altura, gênero $genero")
}

fun olaMundo(): String {
    return "Olá, mundo"
}

fun olaMundo(nome: String): String{
    return "Olá, $nome"
}

fun soma(x:Int, y:Int): Int {
    val resultado = x + y
    return resultado
}

fun multiplica(a: Int, b: Int): Int = a * b
