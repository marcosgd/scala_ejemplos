object Funciones {

  def main(args: Array[String]): Unit = {
    println("Hola funciones ejemplo!");
    println("Suma ints(3,6):"+ sumaInts(3,6));
    println("Square 3:"+ square(3));
    println("Suma of Squares 2,3:"+ sumOfSquares(2,3));
    println("sumSquares  f(sum) from 2..3:"+ sumSquares(2,3));
    println("sumSquares  f(sum) from 2..3 sumSquaresWithAnnoymous:"+ sumSquaresWithAnnoymous(2,3));
    println("sumSquares  f(sum) from 2..3 sumSquaresWithAnnoymousInfTipos:"+ sumSquaresWithAnnoymousInfTipos(2,3));
    
    println("Suma of Squares from 3 to 6:"+ sumPowerOfTwo(3,6));

  }

 def sumaInts(a:Int, b:Int): Int =
   if (a>b) 0 else a + sumaInts(a+1,b)

 def square(x:  Double) = x * x
 def squareInt(x:  Int) = x * x
 def sumOfSquares(x: Double, y: Double) = square(x) + square(y)

 // suma de powers de 2 to n donde n is between a and b
 def powerOfTwo(a:Int): Int = a*a

 def sumPowerOfTwo(a:Int,b:Int):Int =
   if (a > b ) 0 else powerOfTwo(a) + sumPowerOfTwo(a+1,b)

  // funcion sumatorio sum(a..b) f (n) for different values of f .
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  // Ejemplo Sumatorio de potencias pasando funcion squareInt
  def sumSquares(a: Int, b: Int): Int = sum(squareInt, a, b)

  // anonymous functions en vez de squareInt cambiamos por (x: Int) => x * x || (arguments) => body
  def sumSquaresWithAnnoymous(a: Int, b: Int): Int = sum((x: Int) => x * x, a, b)
  def sumSquaresWithAnnoymousInfTipos(a: Int, b: Int): Int = sum(x => x * x, a, b)



} // fin
