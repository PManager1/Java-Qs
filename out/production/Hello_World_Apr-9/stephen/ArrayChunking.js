//chunk  ([1, 2, 3, 4, 5, 6], 2)
////Output will be [[1, 2], [3, 4], [5, 6]]

//        chunk([1, 2, 3, 4, 5], 3)
////Output will be [[1, 2, 3], [4, 5]]

//// chunk([1, 2, 3, 4, 5], 2)
////Output will be [[ 1, 2], [3, 4], [5]]
//stephen says its harder
// 4/18/23  1220 PM


    let chunkSize = 2;
    let arr  = [1, 2, 3, 4, 5, 6];
    console.log ('18 ChunkedArr  .arr =', arr[11]);
        
        let ResultArr = [];
        let ChunkedArr = [];
        for ( let i = 0 ; i < arr.length; i++ ){
            
            // console.log (   ' ChunkedArr  .len =', ChunkedArr.length);
            console.log (   '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~> - OUTSIDE  i  =', i ,  'arr[i]  =', arr[i]);

                // When Chunked Array is EMPTY  ||  JAy -  When i = 2,  why isnt it coming in the IF statement ?
                if ( i == 0    || ChunkedArr.length < chunkSize ) {
                    // push the ChunkedArr into the ResultArr;
                            console.log (   '36 - inside EMPTY i  =', i);
                            console.log (   '36 - EMPTY arr[i]  =', arr[i]);
                            console.log (   '37 - EMPTY  ChunkedArr.length  =', ChunkedArr.length);
                            ChunkedArr.push(arr[i]);
                        console.log (   '38 - ChunkedArr  =', ChunkedArr);
                        // console.log (   '31 - ResultArr  =', ResultArr);
            
                }
                // Jay fix it if you comment below line, it will fuckup the solution.. The problem is in the line 25 i==0;
                if ( ChunkedArr.length < chunkSize ) {  console.log( "35--- ChunkedArr.length < chunkSize  "); }

                else { //  When Chunked Array is FULL
                            ResultArr.push(ChunkedArr); 
                            console.log (   '41- inside ELSE FULL -  ResultArr  =', ResultArr);
                            // ChunkedArr.pop(); ChunkedArr.pop();
                            ChunkedArr = [];

                            console.log (   '================= ChunkedArr should be empty', ChunkedArr );
                            console.log (   '44 - Else  FULL i  =', i); 
                         console.log (   '45- ChunkedArr  =', ChunkedArr);   
                         console.log (   '46- ResultArr  =', ResultArr);
                }

    }



/*
// https://dev.to/sfrasica/one-approach-1kfe

function chunk(array, size) {
  const chunkedArray = [];

  let index = 0;

  while (index < array.length) {
    chunkedArray.push(array.slice(index, index + size));
    index += size;
  }
  return chunkedArray;
}
*/



/*  // by jay 

        let chunkSize = 2;

        let arr  = [1, 2, 3, 4, 5, 6];

        // let Pointer = 0; 
        let ResultArr = []; 
        let tempArr = []; 


        while ( arr.length >0 ){
            let tempArr = []; 
            let arrev = arr.reverse();
            console.log('25 arrev =', arrev);
             
            let pop = arr.pop();
            console.log('21 pop =', pop);  
            tempArr.push(pop);

            let pop2 = arr.pop();
            console.log('21 pop2 =', pop2);  
            tempArr.push(pop2);
            
            ResultArr.push(tempArr); 
          console.log('34 ResultArr =', ResultArr);

        }

*/        
