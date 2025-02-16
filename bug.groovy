```groovy
def myMethod(String str) {
    if (str == null) {
        return "Null input"
    }
    return str.toUpperCase()
}

println myMethod(null) // Output: Null input
println myMethod("")  // Output: 
println myMethod("hello") // Output: HELLO
```