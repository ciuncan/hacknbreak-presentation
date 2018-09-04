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
  println("we are body!")
  override def equals(obj: Any): Boolean =
    name == obj.asInstanceOf[Person].name
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

