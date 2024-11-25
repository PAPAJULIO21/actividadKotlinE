package segundoEjercicio

import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    print("Introduzca una palabra: ")
    val primeraPalabra = sc.next()
    print("Introduzca otra palabra: ")
    val segundaPalabra = sc.next()

    println(anagrama(primeraPalabra, segundaPalabra))

}

fun anagrama(primeraPalabra: String, segundaPalabra: String): String {

    if (primeraPalabra == segundaPalabra.reversed()){
        return "¿Las palbras $primeraPalabra y $segundaPalabra son anagramas?: True"
    }
    return "¿Las palbras $primeraPalabra y $segundaPalabra son anagramas?: False"
}