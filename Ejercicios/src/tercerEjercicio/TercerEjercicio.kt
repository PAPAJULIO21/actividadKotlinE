package tercerEjercicio

fun main(){
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
    val listaDeDelimitadores = mutableListOf<Char>()
    for (char in expresion) {
        when (char) {
            '{', '[', '(' ,'}', ']', ')' -> listaDeDelimitadores.add(char)
        }
    }

    for (i in listaDeDelimitadores){
        if (i == '{' && listaDeDelimitadores.lastOrNull() != '}')
            return "$expresion ¿esta balanceada? No"
        if (i == '[' && listaDeDelimitadores.lastOrNull()!= ']')
            return "$expresion ¿esta balanceada? No"
        if (i == '(' && listaDeDelimitadores.lastOrNull()!= ')')
            return "$expresion ¿esta balanceada? No"

        listaDeDelimitadores.removeLast()
    }


   return "$expresion ¿esta balanceada? Si"
}