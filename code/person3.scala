class Person(val name:String, val age:Int) {
  override def toString = "My name is %s and I'm %d years old.".format(name,age)
}

class Student(val school:String, name:String, age:Int) extends Person(name,age) {
  override def toString = super.toString+" I go to %s.".format(school)
}

trait Cool {
  override def toString = super.toString+" And I'm cool."
}

trait LaidBack {
  override def toString = super.toString+" And I'm laid back."
}

val ferris = new Student("Shermer High", "Ferris Bueller", 17) with LaidBack with Cool

println(ferris toString)

"My name is Ferris Bueller and I'm 17 years old. I go to Shermer High. And I'm laid back. And I'm cool."
