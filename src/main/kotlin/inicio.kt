fun main() {
    while (true) {
        println("Vamos calcular? (Y/N)")
        val respota = readln()
        if (respota == "Y") {
            println("Pode começar:")
            val n1 = readln().toInt()
            val operacao = readln()
            val n2 = readln().toInt()
            if (operacao == "+") {
                println(n1 + n2)
            }

            if (operacao == "-") {
                println(n1 - n2)
            }

            if (operacao == "*") {
                println(n1 * n2)
            }
            if (operacao == "/") {
                println(n1.toDouble() / n2.toDouble())
            }
        } else {
            break
        }
    }
    println("The end...")
}
