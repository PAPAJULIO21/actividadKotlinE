package quintoEjercicio

import kotlin.math.absoluteValue

fun main(){
    val primeraMatriz = listOf(
                        listOf("X", "O", "X"),
                        listOf("O", "X", "O"),
                        listOf("O", "O", "X"))

    val segundaMatriz = listOf(
                        listOf("", "O", "X"),
                        listOf("", "X", "O"),
                        listOf("", "O", "X"))

    val terceraMatriz = listOf(
                        listOf("O", "O", "O"),
                        listOf("O", "X", "X"),
                        listOf("O", "X", "X"))

    val cuartaMatriz = listOf(
                        listOf("X", "O", "X"),
                        listOf("X", "X", "O"),
                        listOf("X", "X", "X")
    )


    println(resultado(primeraMatriz))
    println(resultado(segundaMatriz))
    println(resultado(terceraMatriz))
    println(resultado(cuartaMatriz))


}

fun resultado(matriz: List<List<String>>): String {
    val tamaño = matriz.size
    var numeroDeX = 0
    var numeroDeO = 0


    //Si hay una variable "" asi hay empate en el programa
    for (fila in matriz) {
        if (fila.contains("")) {
            return "EMPATA"
        }
    }

    //Contar numero de X y O
    //Le pregunte a ChatGPT como recorrer una matriz 3x3
    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            if (matriz[i][j] == "X"){
                numeroDeX++
            }
            if (matriz[i][j] == "O"){
                numeroDeO++
            }
        }
    }
    val diferencia = numeroDeX - numeroDeO

    if (diferencia.absoluteValue == 1) {

        // Ganador en filas
        for (i in 0 until tamaño) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                return "${matriz[i][0]} "
            }
        }
        // Ganador en columnas
        for (i in 0 until tamaño) {
            if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i]) {
                return "${matriz[0][i]} "
            }
        }

        //Ganador diagonal izquierda a derecha
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return "${matriz[0][0]} "
        }

        //Ganador diagonal derecha a izquierda
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return "${matriz[0][2]} "
        }
    }else{
        return "NULL"
    }
    return "EMPATE"
}