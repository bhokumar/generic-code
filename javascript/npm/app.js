var express = require('express');
var bodyParser = require('body-parser');

var app = express();

app.set('view engine', 'ejs');

var port = process.env.PORT || 3000;

app.use('/assets', express.static(__dirname + '/public'));

app.use('/', function(request, response, next) {
    console.log('Request url: ' + request.url);
    next();
});

app.get('/', function(request, response) {
    response.render('index');
});

app.get('/api', function(request, response) {
    response.json({firstName: 'Bhoopendra', lastName: 'Kumar'});
});

app.get('/persons/:id', function(request, response) {
    response.render('person', {ID: request.params.id});
});
app.listen(port);