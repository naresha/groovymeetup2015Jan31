class Person{
	String name
	int age
	
	def whoAreYou = {
		println "I am $name, $age"
	}
	
	def sayIt(){
		println whoAreYou.owner
		whoAreYou.delegate = [name:'Mike', age: 25]
		println whoAreYou.delegate
		whoAreYou.resolveStrategy = 
		//	Closure.OWNER_FIRST
			Closure.DELEGATE_FIRST
		whoAreYou()
	}
}

def p = new Person(name: 'Mark', age:20)
println p
p.sayIt()
