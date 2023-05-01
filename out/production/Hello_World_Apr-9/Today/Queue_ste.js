

class Queue {
    constructor() {
        this.data = [];
    }

    add(record){
            this.data.unshift(record);
    }
    remove(){
        console.log("1 remove called  & data=" , data);
       return  this.data.pop();
        console.log("remove called  & data=" , data);
    }
}

// Queue q1 = new Queue([1,2,3,4]);

const q1 = new Queue();

q1.remove();