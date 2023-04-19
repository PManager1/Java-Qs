
//vowel chars = 'a', 'e', 'i', 'o', 'u';
//
//vowels('Hi There!');//3
//        vowels('Why do you ask'); //4
//        vowels('WHy');  //0



    // let st = "Hi There!";

let st = "Why do you ask";
    CharArr = st.split("");
//    System.out.println(" stArr parts Asc   "  +  stArr ); stArr

let Count_Char = 0;
for (let i = 0; i < st.length; i++)
{
    console.log(" stArr parts Asc =  " , CharArr[i] ) ;

    let Char =  CharArr[i] ;

    console.log(" Char =  " , Char ) ;



    if ( Char === "a" || Char === "e" || Char === "i" || Char === "o" || Char === "u" ){
        Count_Char += 1;
    }


}

console.log(" Count_Char =  " , Count_Char ) ;

