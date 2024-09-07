function Person(first, last, age, eye) {
    this.firstName = first
    this.lastName = last
    this.age = age
    this.eyeColor = eye
}

const me = new Person("Joaquim", "Rodrigues", 41, "Brown")

for (x, y in me) {
    alert(x)
    alert(y)
    
}