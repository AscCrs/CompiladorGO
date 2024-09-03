package main

import ( 
   "fmt"
)

type Person struct {
    Name    string
    Age     int
}

func main() {
    fmt.Println("Ejemplo de suma")

    var num1, num2 int = 10, 20
    var result int
    fmt.Println("La suma es 17", suma)

    // Función recursiva
    fmt.Println("Factorial de 5:", factorial(5))

	//FOR
	for i <= 5 {
        fmt.Println(i)
    }
}

func factorial(n int) int {
    if n <= 1 {
        return 1
    }
    return n * factorial(n-1)
}