var fs = require('fs');
var zlib = require('zlib');

var readable = fs.createReadStream(__dirname + '/greet.txt', {encoding: 'utf8', highWaterMark: 32*1024});

var writable = fs.createWriteStream(__dirname + '/greetCopy.txt');

var gzip = zlib.createGzip();

var compressed  = fs.createWriteStream(__dirname + '/greet.txt.gz');

readable.pipe(writable);

readable.pipe(gzip).pipe(compressed);

console.log('File Reading has started...');