class Person(val name:String, val age:Int) {
  override def toString = "My name is %s and I'm %d years old.".format(name,age)
}

class Student(val school:String, name:String, age:Int) extends Person(name,age) {
  override def toString = super.toString+" I go to %s".format(school)
}

val alan = new Student("RIT", "Alan Dipert", 25)

println(alan toString)

"My name is Alan Dipert and I'm 25 years old. I go to RIT."
