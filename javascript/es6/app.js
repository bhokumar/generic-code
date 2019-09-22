var name = 'Bhoopendra Kumar';

var greet = 'Hello ' + name;

var greet2 = `Hello ${name}`;

//console.log(greet);
//console.log(greet2);


var obj = {
    name: 'Bhoopendra Kumar',
    greet: function() {
        console.log(`Hello ${this.name}`);
    }
}

function sum() {
    console.log(this.a);
}

sum.call({a: 20});
sum.apply({a: 20});

//obj.greet.call({name: 'Bijendra'});
//obj.greet.apply({name: 'Bijendra'});