var http = require('http');
var fs = require('fs');

http.createServer(function(request, response) {
    response.writeHead(200, {'Content-Type': 'text/html'});
    var html = fs.readFileSync(__dirname + '/index.html', 'utf8');
    var message = 'Hello World...!!!!';
    var obj = {
        firstName: 'Bhoopendra',
        lastName: 'Kumar'
    };
    html.replace('{Message}', message);
    response.end(JSON.stringify(obj));
}).listen(1337, '127.0.0.1');