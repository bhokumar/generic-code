var Emitter = require('events');
var eventsConfig = require('./config').events;

var emitter = new Emitter();

emitter.on(eventsConfig.GREET, function(){
    console.log('Somewhere someone said hello');
});

emitter.on(eventsConfig.GREET, function(){
    console.log('A greeting occurred!');
});

console.log('Hello');
emitter.emit(eventsConfig.GREET);