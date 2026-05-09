class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        // whenever the token '+', '-', '*', and '/' 
        // last 2 el poll and do the operation
        // than push

        const operations = ["+","-","*","/"];

        const stack = [];

        for (let i = 0; i < tokens.length; i++) {
        if (operations.includes(tokens[i])) {
            const firstEl = parseInt(stack.pop());
            const secondEl = parseInt(stack.pop());
            console.log(firstEl, secondEl);
            if (tokens[i] === "+") {
                stack.push(firstEl + secondEl);
            } else if (tokens[i] === "-") {
                stack.push(secondEl - firstEl);
            } else if (tokens[i] === "*") {
                stack.push(firstEl * secondEl);
            } else if (tokens[i] === "/") {
                  stack.push(secondEl / firstEl);
            }
        } else {
            stack.push(tokens[i]);
        }
    }

    return Math.floor(stack.pop());
        
    }
}
