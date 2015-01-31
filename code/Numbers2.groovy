def numbers = [3, 2, 1, 5, 4]

def even = []
for(int num in numbers){
	if(num % 2 == 0)
		even << num
}
println even

println numbers.findAll { it % 2 == 0}
println numbers.findAll { it % 2}

def findNumbers(nums, def closure){
	def result = []
	nums.each { 
		if(closure(it))
			result << it
	}
	return result
}

println findNumbers(numbers, {true})
println findNumbers(numbers, { it % 2 == 0})

