
def doubleNumber = { 
	println "Doubling $it"
	it * 2 
}.memoize()

println doubleNumber(2)
println doubleNumber(3)
println doubleNumber(2)
