```groovy
def myMethod(String str) {
    if (str == null || str.isEmpty()) {
        return "Null or empty input"
    }
    return str.toUpperCase()
}

println myMethod(null) // Output: Null or empty input
println myMethod("")  // Output: Null or empty input
println myMethod("hello") // Output: HELLO
```