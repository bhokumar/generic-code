var buffer = Buffer.from('Hello', 'utf8');

console.log(buffer);

console.log(buffer.toString());
console.log(buffer.toJSON());

var arrayBuffer = new ArrayBuffer(8);
var view = new Int32Array(arrayBuffer);

view[0] = 5;
view[1] = 6;
//view[2] = 15;

console.log(view);