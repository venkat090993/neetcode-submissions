class MinStack {
    stack;
    minStack;
    constructor() {
        this.stack = [];
        this.minStack = [];
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        this.stack.push(val);
        // Here, when I push, 
        // I peek and see if the incoming item is greater or less
        // if less I push the less item else I push the same item again
        if(this.minStack.length > 0){
            if(this.minStack[this.minStack.length - 1] !== undefined && val < this.minStack[this.minStack.length - 1]){
                this.minStack.push(val);
            }else{
                this.minStack.push(this.minStack[this.minStack.length - 1]);
            }
        }else{
            this.minStack.push(val);
        }
    }

    /**
     * @return {void}
     */
    pop() {
        this.stack.pop();
        this.minStack.pop();
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length - 1];
    }

    /**
     * @return {number}
     */
    getMin() {
        if(this.minStack.length > 0){
            return this.minStack[this.minStack.length - 1];
        }
    }
}
