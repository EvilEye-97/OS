class Person(var name: String, var age: Int, var country: String) {
 def getName: String = name
 def setName(newName: String): Unit = {
 name = newName
 }
 def getAge: Int = age
 def setAge(newAge: Int): Unit = {
 age = newAge
 }
 def getCountry: String = country
 def setCountry(newCountry: String): Unit = {
 country = newCountry
 }
}
object PersonApp {
 def main(args: Array[String]): Unit = {
 val person = new Person("Andrey Ira", 35, "France")
 println("Original Person:")
 println(s"Name: ${person.getName}")
 println(s"Age: ${person.getAge}")
 println(s"Country: ${person.getCountry}")
 person.setName("Lior Daniela")
 person.setAge(30)
 person.setCountry("Canada")
 println("\nUpdated Person:")
 println(s"Name: ${person.getName}")
 println(s"Age: ${person.getAge}")
 println(s"Country: ${person.getCountry}")
  person.setName("Lakshya Sharma")
 person.setAge(19)
 person.setCountry("India")
 println("\nUpdated Person:")
 println(s"Name: ${person.getName}")
 println(s"Age: ${person.getAge}")
 println(s"Country: ${person.getCountry}")
 }
}
