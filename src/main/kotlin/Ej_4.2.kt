import java.lang.Math.round

fun main() {
    val per1 = Persona(71f, 1.72f)
    val per2 = Persona("Diego", 75f, 1.80f)
    val per3 = Persona("Mario", 79f, 1.82f)

    println(per1.toString())
    println(per2.toString())
    println(per3.toString())

}

class Persona (var peso: Float, var altura: Float) {

    var nombre: String = "sin nombre"
    var imc = round(this.peso / (this.altura*this.altura) * 100.00) / 100.00

    constructor(nombre: String, peso: Float, altura: Float): this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "El peso de ${this.nombre} es ${this.peso} Kg, su altura es de ${this.altura} m lo que hacen que tenga un IMC de ${this.imc}"
    }

}
