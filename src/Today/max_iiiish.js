
// Suppose we have two lists of signed integers in ascending order: a and b.
// Write a function that takes these two ordered lists as well as an integer max_array_length
// argument and returns a merged list with max_array_length elements in ascending order.
//
//        Example:
//        a = [1, 3, 5]
//        b = [2, 6, 8, 9]
//
//        max_array_length = 3
//
//
//        => [1, 2, 3]


       let a = [1, 3, 5];
        let b = [2, 6, 8, 9];

const max_array_length = 3

//  merge two arrays
     let mergedArr = a.concat(b);
    console.log('merged = ', mergedArr );

console.log('merged slice = ', mergedArr.slice(0,3) );


