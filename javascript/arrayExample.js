var array = [];

array.push(function(){
    console.log('Function 1');
});

array.push(function(){
    console.log('Function 2');
});

array.push(function(){
    console.log('Function 3');
});

array.push(function(){
    console.log('Function 4');
});

array.forEach(function(item) {
    if (typeof item === 'function') {
        item();
    }
})