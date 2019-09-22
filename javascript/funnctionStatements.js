function greet() {
    console.log('Hi');
}

function logGreeting(fn) {
    fn();
}

logGreeting(greet);

var greetMe = function() {
    console.log('Hi Tony!');
}

logGreeting(greetMe);