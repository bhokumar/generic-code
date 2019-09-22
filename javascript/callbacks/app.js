function greet(callback) {
    console.log('Hello');
    
    var data = {
        name: 'Bhoopendra Kumar'
    };
    callback(data);
}

greet(function(data){
    console.log(data);
});

greet(function(data){
    console.log(data.name);
});
