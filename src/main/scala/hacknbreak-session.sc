var a: Int = 5

a = 3

def add(n1: Int, n2: Double) = {
  n1 + n2
}

val additionResult = add(1,2)

for (i <- 1 to 10) {
  println("next number is " + i)
}

for (i <- 0 until 10) {
  println("next number is " + i)
}

val deger = if (a < 3 || a > 100) {
  if (a < 0) {
    "cok kucuk"
  } else {
    "kucuk"
  }
} else {
  "buyuk"
}

"ceyhun" substring 3

1 + 2 == 1.+(2)
1.to(5)

case class Person(
  name: String,
  age: Int
) {
  println("we are in class body (constructor)!")

  // equals, hashCode and toString
  // are written for you!
  // you can override them if you wish so

//  override def equals(obj: Any): Boolean =
//    name == obj.asInstanceOf[Person].name
}

val person = Person(
  "Ceyhun",
  30
)
val person2 = Person(
  "Ceyhun",
  29
)
println(person.name)
println(person == person2)

val someValue = 5
val patternMatchResult = someValue match {
  case 1 => "one"
  case 2 => "two"
  case n if n > 4 =>
    "some unknown number greater than 4: " + n
  case _ => "completely unknown number."
}

person match {
  case Person("Ceyhun", 30) =>
    println("I know you! Hi Ceyhun!")
  case p => println("I don't know you!" + p)
}

case class Pet(name: String, owner: Person)

val pet = Pet("shiro", person)

pet match {
  case Pet(n, Person("Ceyhun", _)) =>
    println("You are Ceyhun's pet " + n)
}

trait Animal {
  def makeSound: String
  def describeMe() =
    "This animal makes this sound: " +
      makeSound
}

case class Cat(name: String) extends Animal {
  def makeSound = name + " says Meow!!"
}

trait AngryAnimal extends Animal {
  override def makeSound = "Grrrr!!!"
}

val myCat = Cat("Shiro")
val myBrothersCat = new Cat("Tekila") with AngryAnimal

println(myCat.describeMe())
println(myBrothersCat.describeMe())

val list = new java.util.ArrayList[Int]()
list.add(1)
list.add(2)
list.add(3)
println(list)

// you can import almost anywhere
import java.util.ArrayList

val fiveTimes = new ArrayList[Int]()
for (i <- 0 until list.size) {
  fiveTimes.add(list.get(i) * 5)
}
println(fiveTimes)


val squares = new ArrayList[Int]()
for (i <- 0 until list.size) {
  val value = list.get(i)
  fiveTimes.add(value * value)
}
println(squares)

def changeValue(input: Int): Int = {
  input * 5
}
val changeValue: Int => Int = input => input*5
// same as above:
// val changeValue: Int => Int = _ * 5

def transform(l: ArrayList[Int],
              f: Int => Int
             ): ArrayList[Int] = {

  val newList = new ArrayList[Int]()
  for (i <- 0 until l.size) {
    val value = l.get(i)
    val newValue = f(value)
    newList.add(newValue)
  }
  newList
}

transform(list, n => n * 5)
transform(list, n => n * n)
transform(list, _ * 5)
transform(list, changeValue)

val evenSquares = new ArrayList[Int]()
for (i <- 0 until list.size) {
  val value = list.get(i)
  if (value % 2 == 0) {
    evenSquares.add(value * value)
  }
}
evenSquares

def filter(l: ArrayList[Int],
           p: Int => Boolean
          ): ArrayList[Int] = {

  val filteredList = new ArrayList[Int]()
  for (i <- 0 until list.size) {
    val value = list.get(i)
    if (p(value)) {
      filteredList.add(value)
    }
  }
  filteredList
}

// first take the even numbers, then square them
val evenNumbers = transform(
  filter(list, _ % 2 == 0),
  n => n * n
)

// first square the even numbers, then take ones that are less then 8
filter(
  transform(
    list,
    n => n * n
  ),
  _ < 8
)


