
def message = 'How are you?'
def wish = { name ->
	println "Hello $name, $message"
}

wish 'Mark'
message = 'Hi'
wish 'Mike'

