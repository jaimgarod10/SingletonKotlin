fun main(){

    var pepe :Persona=Persona("pepe","Garcia", 90)
    println(pepe.toString())
    println(Persona.toString())
    var manuel :Persona=Persona("manuel","Lopez", 12)
    println(manuel.toString())
    println(Persona.toString())
    println("****"+PersonaUnica.nombre+"****")
    PersonaUnica.avnzar()
    PersonaUnica.avnzar()
    println(PersonaUnica.pasos)
    
}