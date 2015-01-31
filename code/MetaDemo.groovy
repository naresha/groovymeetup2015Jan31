def name = 'Mark'
String.metaClass.sayHi = {
	println "Hi from $delegate"
}
name.sayHi()
"Mike".sayHi()