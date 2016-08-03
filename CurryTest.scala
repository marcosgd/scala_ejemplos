object CurryTest extends App {

// Dada una función f del tipo                            f: ( X × Y ) → Z
// currificándola sería una función del tipo       curry(f):  X → (Y → Z)
// toma una argumento del tipo X y retorna una funcion del tipo (Y → Z)

 // Ej: Note that method modN is partially applied in the two filter calls;
 // i.e. only its first argument is actually applied.
 // The termmodN(2) yields (produce) a function of type Int => Boolean
 // and is thus a possible candidate for the second argument of function filter.

  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)

  //  curried function definition
  //  def f (args1) ... (argsn) = E
  def modN(n: Int)(x: Int) = ((x % n) == 0)

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))
}
