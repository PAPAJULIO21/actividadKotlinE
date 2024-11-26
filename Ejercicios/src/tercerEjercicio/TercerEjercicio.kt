package tercerEjercicio

fun main() {
    val primera = "{a + b [c] * (2x2)}}}}"
    val segunda = "{ [ a * ( c + d ) ] - 5 }"
    val tercera = "{ a * ( c + d ) ] - 5 }"
    val cuarta = "{a^4 + (((ax4)}"
    val quinta = "{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
    val sexta = "{{{{{{(}}}}}}"
    val septima = "(a"

    println(estaBalanceada(primera))
    println(estaBalanceada(segunda))
    println(estaBalanceada(tercera))
    println(estaBalanceada(cuarta))
    println(estaBalanceada(quinta))
    println(estaBalanceada(sexta))
    println(estaBalanceada(septima))
}

fun estaBalanceada(expresion: String): String {

    var countLlaveAbierta = 0
    var countCorcheteAbierto = 0
    var countParentesisAbierto = 0

    for (char in expresion) {
        when (char) {
            '{' -> countLlaveAbierta++
            '}' -> {
                countLlaveAbierta--
                if (countLlaveAbierta < 0) return "$expresion ¿Está balanceada? No"
            }
            '[' -> countCorcheteAbierto++
            ']' -> {
                countCorcheteAbierto--
                if (countCorcheteAbierto < 0) return "$expresion ¿Está balanceada? No"
            }
            '(' -> countParentesisAbierto++
            ')' -> {
                countParentesisAbierto--
                if (countParentesisAbierto < 0) return "$expresion ¿Está balanceada? No"
            }
        }
    }

    return if (countLlaveAbierta == 0 && countCorcheteAbierto == 0 && countParentesisAbierto == 0) {
        "$expresion ¿Está balanceada? Sí"
    } else {
        "$expresion ¿Está balanceada? No"
    }
}
