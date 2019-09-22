var Greeter  = require('./Greeter');

var greetr1 = new Greeter();

greetr1.on('greet', function(data){
    console.log('Someone Greeted!', data);
});

greetr1.greet('Tony123');