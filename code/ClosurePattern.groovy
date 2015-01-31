
def c1 = { println "Hello"}

def c2 = { println "Hi"}

[c1, c2].each{ 
	it()
	}

c1()
c2()

/*
interface Command{
	def execute()
}

MyCommand1 implements Command{
	def execute(){
		println "Hello"
	}
}

//MyCommand2

def executeCommand(Command cmd){
	cmd.execute()
}
*/


def add(n1, n2){
	n1 + n2
}

def addC = { n1, n2 ->
	n1 + n2
}

