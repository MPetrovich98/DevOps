//https://code-maven.com/groovy-import-functions-from-another-file

GroovyShell shell = new GroovyShell()
def tools = shell.parse(new File('math.gvy'))

println(tools.fib(8))

println(tools.power1(5,2))