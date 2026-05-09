class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
isValid(s) {
    const stack = [];
    const opening = ["(", "{", "["]
    const closing = [")", "}", "]"]
    for (let i = 0; i < s.length; i++) {
        if (opening.includes(s[i])) {
            stack.push(s[i]);
        } else if (closing.includes(s[i])) {
            console.log(stack[stack.length - 1], "stack peek", s[i], "s[i] === '{'")
            if (s[i] === "}" && stack[stack.length - 1] === "{") {
                stack.pop();
            } else if (s[i] === ")" && stack[stack.length - 1] === "(") {
                stack.pop();
            } else if (s[i] === "]" && stack[stack.length - 1] === "[") {
                stack.pop();
            } else {
                return false;
            }
        }
    }

    if (stack.length === 0) {
        return true;
    } else {
        return false;
    }
}
}
