def capitals = [India: 'New Delhi',
	France: 'Paris']
println capitals
println capitals.getClass()

capitals.each{k, v ->
	println "$v"
}

capitals.each{entry->
	println "${entry.key} -> ${entry.value}"
}

def wish = { name, message ->
	"Hello $name"
}

println wish('Mark', 'Hello')
def paramsCount= wish.getMaximumNumberOfParameters()
if(paramsCount == 1){
	wish('Mark')
}
else{
	wish('Mark', 'How are you?')
}



