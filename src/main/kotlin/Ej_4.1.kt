fun main() {
    val rectangulo1 = Rectangulo(10, 10)
    val rectangulo2 = Rectangulo(7, 9)
    val rectangulo3 = Rectangulo(1, 15)

    println(rectangulo1.toString())
    println(rectangulo2.toString())
    println(rectangulo3.toString())
}

class Rectangulo (val base: Int, val altura: Int) {

    val area = this.base *this.altura
    val perimetro = 2 * this.base + 2 * this.altura

    init {
        require(this.base > 0 && this.altura > 0) { "La base y altura tienen que ser mayor de 0"
        }
    }

    override fun toString(): String {
        return "El rectángulo de base ${this.base}cm y altura ${this.altura}cm tiene un área de ${this.area}cm2 y un perímetro de ${this.perimetro}cm."
    }

    //fun area() = this.base * this.altura
    //fun perimetro() = 2 * this.base + 2 * this.altura

}