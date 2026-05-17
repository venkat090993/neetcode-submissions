class Solution {
    /**
     * @param {number} n - a positive integer
     * @return {number} - a positive integer
     */
    reverseBits(n) {
        let reversedByte = 0;
        for(let i = 0; i<32; i++){
            reversedByte <<= 1; // make room
            const lastBit = n & 1; // take last bit
            reversedByte |= lastBit; // or it with reversed
            n >>=1 // shift n by right
            
        }
        return reversedByte >>> 0;
    }
}
