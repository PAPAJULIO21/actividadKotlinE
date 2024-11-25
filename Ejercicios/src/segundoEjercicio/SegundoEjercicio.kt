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
// En una busqueda por internet encontre el metodo reversed que le da la vuelta a la palabra
    if (primeraPalabra == segundaPalabra.reversed()){
        return "¿Las palbras $primeraPalabra y $segundaPalabra son anagramas?: True"
    }
    return "¿Las palbras $primeraPalabra y $segundaPalabra son anagramas?: False"
}
