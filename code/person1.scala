class Person(val name:String, val age:Int) {
  override def toString = "My name is %s and I'm %d years old.".format(name,age)
}

val thePrez = new Person("Barack Obama", 48)

println(thePrez.toString)

"My name is Barack Obama and I'm 48 years old."
