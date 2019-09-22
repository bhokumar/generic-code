var fs = require('fs');

var readable = fs.createReadStream(__dirname + '/greet.txt', {encoding: 'utf8', highWaterMark: 32*1024});

var writable = fs.createWriteStream(__dirname + '/greetCopy.txt');

readable.pipe(writable);

console.log('File Reading has started...');