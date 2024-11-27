package cuartoEjercicio

import kotlin.math.absoluteValue

fun main(){
    val arrayPrimero: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    var stringPrimero = "_|_|_"

    val arraySegundo: Array<String> = arrayOf("correr", "correr", "correr", "saltar", "correr")
    var stringSegundo = "_|_|_"

    val arrayTercero: Array<String> = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    var stringTercero = "_|_|_"

    val arrayCuarto: Array<String> = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    var stringCuarto = "_|_|_|_"

    val arrayCinco : Array<String> = arrayOf("correr", "saltar", "correr", "saltar")
    var stringCinco = "_|_|_"

    val arraySeis: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    var stringSeis = "_|_|_"

    val arraySiete: Array<String> = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    var stringSiete = "|||||"

    val arrayOcho: Array<String> = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    var stringOcho = "||_||"


    println(superadoCarrera(arrayPrimero, stringPrimero))
    println(superadoCarrera(arraySegundo, stringSegundo))
    println(superadoCarrera(arrayTercero, stringTercero))
    println(superadoCarrera(arrayCuarto, stringCuarto))
    println(superadoCarrera(arrayCinco, stringCinco))
    println(superadoCarrera(arraySeis, stringSeis))
    println(superadoCarrera(arraySiete, stringSiete))
    println(superadoCarrera(arrayOcho, stringOcho))


}

fun superadoCarrera(array: Array<String>, string: String): String {
    var listaDeLaCarrera: ArrayList<Char> = ArrayList()
    var bienOMal = true
    var stringFinal = string

    if (array.size != string.length) {
        val diferencia = (array.size - stringFinal.length).absoluteValue
        stringFinal = string + "?".repeat(diferencia)
    }

    for (i in array.indices) {
        if (array[i] == "correr" && stringFinal[i] == '_') {
            listaDeLaCarrera.add(stringFinal[i])
        }
        if (array[i] == "saltar" && stringFinal[i] == '|') {
            listaDeLaCarrera.add(stringFinal[i])
        }
        if (array[i] == "correr" && stringFinal[i] == '|') {
            listaDeLaCarrera.add('/')
            bienOMal = false
        }
        if (array[i] == "saltar" && stringFinal[i] == '_') {
            listaDeLaCarrera.add('x')
            bienOMal = false
        }
        if(stringFinal[i] == '?'){
            listaDeLaCarrera.add('?')
            bienOMal = false
        }
    }

    if (string.length > array.size) {
        listaDeLaCarrera.addAll("?".repeat(string.length - array.size).toList())
        bienOMal = false
    }

    return "${listaDeLaCarrera.joinToString("")}  $bienOMal"
}
