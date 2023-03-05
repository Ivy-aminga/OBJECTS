fun main() {
 var person = Human("Joy", 30, 58.7)
 person.eat(4)
 person.birthday()
 person.speak("Study smart.")


 var Ivy= User("Ivy", "Aminga", "amingaivy@gmail.com", "0712345678", 10000)
 println(Ivy.lastName)
 println(Ivy.email)
}


//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions




class Human(var name:String, var age:Int, var weight:Double ){
 fun eat(foodWeight: Int){
  var newWeight = weight + foodWeight
  print("I am eating $newWeight kgs of food ")
 }
 fun speak(speech: String){
  var speak=speech
  println(speak)
 }
 fun birthday(){
  var  newAge=++age
  println(newAge)
 }
}




//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes



class User(var firstName: String, var lastName: String, var email:String, var phoneNumber:String, var passWord:Int){
 fun details() {


 }
 }















