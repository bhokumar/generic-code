var fs = require('fs');

var greet = fs.readFileSync(__dirname + '/greet.txt', 'utf8');

console.log(greet);

var greet2 = fs.readFile(__dirname + '/greet.txt', 'utf8', function(error, data){
    console.log(data);
});

console.log('Done!');