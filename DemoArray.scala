import Array._
//operaciones con arrays
object DemoArray {
   def main(args: Array[String]) {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)

      // Print all the array elements
      for ( x <- myList3 ) {
         println( x )
      }

      // Summing all elements
    var total = 0.0;

    for ( i <- 0 to (myList3.length - 1)) {
       total += myList3(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList3(0);

    for ( i <- 1 to (myList3.length - 1) ) {
       if (myList3(i) > max) max = myList3(i);
    }
    println("Max is " + max);

    rangos();
  }

 def rangos(){
  var myList1 = range(10, 20, 2)
      var myList2 = range(10,20)

      // Print all the array elements
      for ( x <- myList1 ) {
         print( " " + x )
      }

      println()
      for ( x <- myList2 ) {
         print( " " + x )
      }
}

}
