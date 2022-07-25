
def match = "Groovy" =~ "Groovy"
println match[0]

match = "Groovy" =~ "123"


if (match){
    println match[0]
}else{
    println "No match found"
}

(match)? println(match[0]): println("No match found")

match = "Groovy" =~"o"
if(match){
    def i=0
    while(match){
        println match[i]
        i++
    }
}

def regex = /(?:[^Groovy]*)/
match = "This is Groovy" =~ regex

if(match){
    def i=0
    while(match){
        println match[i]
        i++
    }
}