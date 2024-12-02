package sextoEjercicio

val personas = arrayOfNulls<Contacto>(3)

fun main(){
    var validar = false
    do {
        println("------------")
        println("Agenda")
        println("------------")
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        println("------------")
        print("Escribe una de las opciones: ")
        val opcion = readLine()!!.toInt()

        when(opcion) {
            1 -> añadirContacto()
            2 -> listarContactos()
            3 -> buscarContacto()
            4 -> existeContacto()
            5 -> eliminarContacto()
            6 -> contactosDisponibles()
            7 -> agendaLlena()
            8 -> {
                println("Un abrazo fuerte.")
                validar = true
            }
            else -> println("Opción incorrecta")

        }

    }while(!validar)

}

fun añadirContacto(){
    println("------------")
    println("Añadir contacto")
    println("------------")
    print("Nombre: ")
    val nombre = readLine()!!
    print("Telefono: ")
    val telefono = readLine()!!
    println("------------")

    val contacto = Contacto(nombre, telefono)


    for(i in personas.indices){

        if(personas[i]?.getNombre().equals(contacto.getNombre(),true)){
            println("No se permiten meter contactos con el mismo nombre")
            return
        }

        if(personas[i] == null){
            personas[i] = contacto
            println("Contacto añadido correctamente")
            return
        }

    }

    println("Agenda llena")
    return
}

fun listarContactos(){
    println("------------")
    println("Listar contactos")
    println("------------")

    if(personas.all { it == null }){
        println("No hay contactos en la agenda")
        return
    }

    for(i in personas.indices){
        if(i != null){
            println("Nombre: ${personas[i]?.getNombre()} - Telefono: ${personas[i]?.getTelefono()}")
        }
    }




}

fun buscarContacto(){

    println("------------")
    print("Que contacto buscas? ")
    val contacto = readLine()!!
    println("------------")

    for(i in personas.indices){
        if(personas[i]?.getNombre() == contacto){
            println("El numero de telefono de $contacto es: ${personas[i]?.getTelefono()}")
            return
        }
    }

    println("No hay contactos con ese nombre")
}

fun  existeContacto(){
    println("------------")
    print("Que contacto buscas? ")
    val nombreContacto = readLine()!!
    println("------------")

    for(i in personas.indices){
        if(personas[i]?.getNombre().equals(nombreContacto,true)){
            println("$nombreContacto existe en la agenda")
            return
        }
    }

    println("$nombreContacto no existe en la agenda")
}

fun eliminarContacto(){
    println("------------")
    print("Que contacto quieres eliminar? ")
    val nombreContacto = readLine()!!
    println("------------")

    for(i in personas.indices){
        if(personas[i]?.getNombre().equals(nombreContacto,true)){
            personas[i] = null
            println("$nombreContacto eliminado correctamente")
            return
        }
    }

    println("No hay contactos con ese nombre")
}

fun contactosDisponibles(){
    println("------------")
    println("Contactos disponibles")
    println("------------")

    var contactosDisponibles:Int = 0

    for(i in personas.indices){
        if(personas[i]== null){
           contactosDisponibles++
        }
    }

    println("Hay $contactosDisponibles contacto/s libre/s")
}

fun agendaLlena(){
    println("------------")
    println("Agenda llena")
    println("------------")

    if(personas.all { it == null }){
        println("Aun se pueden meter contactos")
        return
    }

    println("La agenda está llena")



}