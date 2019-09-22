var EventEmitter = require('events');
var util = require('util');

function Greeter(){
    EventEmitter.call(this);
    this.greeting = 'Hello World'
}

util.inherits(Greeter, EventEmitter);

Greeter.prototype.greet = function(data) {
    console.log(this.greeting, data);
    this.emit('greet', data);
}

var greetr1 = new Greeter();

greetr1.on('greet', function(data){
    console.log('Someone Greeted!', data);
});

greetr1.greet('Tony');