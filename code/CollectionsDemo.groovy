
def numbers = (1..5) 
//println numbers

numbers.each{
	println it
}

def printIt = { println it}
//numbers.each(printIt)
def doubleIt = { it * 2}
println numbers.collect(doubleIt)
println numbers

/*
//@groovy.transform.CompileStatic
class Hello{
	def doIt(){
		String name = 'Mark'
		name.doSomething()
	}
}
*/





