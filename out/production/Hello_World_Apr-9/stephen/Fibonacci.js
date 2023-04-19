
// 1, 1, 2, 3, 5,8, 13,  (  The next number is sum of two preceding numbers. )

// MUST DO RECURSSIVE SOLUTION

// Jay do it with recursion.


let arr = [1, 1 ];


console.log ( " first =", arr[arr.length-2]);
console.log ( " sec =", arr[arr.length-1]);

let counter =0;
console.log ( " length =", arr.length );
                // arr.length -1 ;
    for ( let i=0; i<= 5; i++){
        let insertNew = arr [arr.length -2] + arr [arr.length -1];
        arr.push(insertNew);
        console.log ( " new arr =", arr );
    }

