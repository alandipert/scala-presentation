class Person(n:String, a:Int) {
  val name = n
  val age = a
  override def toString = "My name is %s and I'm %d years old.".format(name,age)
}

val thePrez = new Person("Barrack Obama", 48)

println(thePrez toString)

class Student(u:String, n:String, a:Int) extends Person(n,a) {
  val school = u
  override def toString = super.toString+" I go to %s.".format(school)
}

trait Cool {
  override def toString = super.toString+" And I'm cool."
}

trait LaidBack {
  override def toString = super.toString+" And I'm laid back."
}

println(new Person("Barrack Obama", 48))
println(new Person("Jeffrey Lebowski", 44) with LaidBack)
println(new Student("RIT", "Alan Dipert", 25))
println(new Student("Shermer High", "Ferris Bueller", 17) with LaidBack with Cool)
