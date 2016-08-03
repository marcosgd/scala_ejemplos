
# Indentation

Indentation should follow the “2-space convention”
// right!
class Foo {
  def bar = ..

}

El lenguaje Scala fomenta una cantidad sorprendente de los ámbitos anidados
No se debe penalizar a ti mismo sintácticamente para la apertura de un nuevo bloque

# Line Wrapping
Una líena debe tener como mucho 80 carácteres sino se vuelve ilegible. Se debe dividir en varias.
Si no es posible y tiene que ser una sóla,  se debe indentar por dos espacios en blanco.

Cuando llamamos a un método con 5ó+ parámetros, indentarlos uno por linea separado por dos espacios
Ej:
foo(
  someVeryLongFieldName,
  andAnotherVeryLongFieldName,
  "this is a string",
  3.1415)

Se debe mantenter la indentacion con respecto a la linea que le corresponde

// right!
val myOnerousAndLongFieldNameWithNoRealPoint =
  foo(
    someVeryLongFieldName,
    andAnotherVeryLongFieldName,
    "this is a string",
    3.1415)

// wrong!
val myOnerousAndLongFieldNameWithNoRealPoint =
foo(someVeryLongFieldName,
andAnotherVeryLongFieldName);

# Naming conventions
Scala usa “camel case”, cada palabra es capitalizada, excepto a veces la primera:. Ej: UpperCamelCase, lowerCamelCase
Underscores están permitidos pero deben evitarse ya que tienen un significado especial en sintaxis Scala

# Classes/Traits
Classes deben estar en upper camel case. Ej:class MyFairLady

# Paquetes
Scala packages deben seguir la convención de paquetes en Java
Ej: : package com.novell.coolness  //right! puts only coolness._ in scope

# Methods
lower camel case. Ej: def myFairMethod = ...

# Accessors/Mutators (get/set/boolean property) java

class Foo {
  def bar = ...
  def bar_=(bar: Bar) {
    ...
  }
  def isBaz = ...
}
val foo = new Foo
foo.bar             // accessor
foo.bar = bar2      // mutator
foo.isBaz           // boolean property


For accessors of properties, the name of the method should be the name of the property.
In some instances, it is acceptable to prepend “`is`” on a boolean accessor (when no corresponding mutator is provided)
For mutators, the name of the method should be the name of the property with “_=” appended._

# Paréntesis

foo1 puede ser llamada con y sin paréntesis, foo2 no se puede llamar con paréntesis.
EJ: def foo1() = ... def foo2 = ...

// doesn't change state, call as birthdate
def birthdate = firstName
// updates our internal state, call as age()
def age() = {
  _age = updateAge(birthdate)
  _age
}_

En Scala, no hay distinción entre campos y métodos.

#Constants, Values, Variable and Methods
Constant  upper camel case. Is final, immutable and it belongs to a package object or an object
Method, Value and variable names should be in lower camel case:

#Type Parameters (generics)
Para parámtros simples, se utiliza la letra mayúscula empezando con A

class List[A] {
  def map[B](f: A => B): List[B] = ...
}

Si el tipo del parámetro tiene un significado específico, se debe usar un nombre descriptibo siguiendo las convenciones
// Right
class Map[Key, Value] {
  def get(key: Key): Value
  def put(key: Key, value: Value): Unit
}

Si el alcance del tipo de parámetro es pequeño, se pude usar  un nombre descriptivo.

class Map[K, V] {
  def get(key: K): V
  def put(key: K, value: V): Unit
}

#Annotations
Annotations, such as @volatile should be in lower camel case

# Inferencia
Usar inferencia de tipos donde sea posible. No anotar el tipo donde sea evidenciado su valor.
Todos los métodos púbilos deben explicitar anotación de tipos

# Valor de Funciones
Espacio  entre valor y tipo. Ej:value: Type

# Ascription

# Functions
Deben ser defindias con un espacio entre el tipo de parámetro,  => y el tipo de retorno
def foo(f: Int => String) =
Los paréntesis deben omitirse si es posible
## Arity-1
def map[B](f: A => B) = ...

# Coss interesantes
Function definitions start with def,
Variable definitions start with var
Constantes, definitions of values start with val.
