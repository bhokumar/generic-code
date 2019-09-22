function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

Person.prototype.greet = function() {
    console.log('welcome', this.firstName, this.lastName);
}

var john = new Person('John', 'Lawata');
Person.prototype.age = 40;
var bhoopendra = new Person('Bhoopendra','Kumar');


bhoopendra.greet();
console.log(bhoopendra);
console.log(john.age);

console.log(john.greet === bhoopendra.greet);


john.greet();