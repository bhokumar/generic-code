var http = require('http');
var fs = require('fs');

http.createServer(function(request, response) {
    response.writeHead(200, {'Content-Type': 'text/html'});
    var html = fs.readFileSync(__dirname + '/index.html', 'utf8');

    if (request.url == '/') {
        fs.createReadStream(__dirname + '/index.html').pipe(response);
    } else if (request.url === '/api') {
        var obj = {
            firstName: 'Bhoopendra',
            lastName: 'Kumar'
        };
        response.end(JSON.stringify(obj));
    } else { 
        response.writeHead(404);
        response.end();
    }

}).listen(1337, '127.0.0.1');