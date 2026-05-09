class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        // one pass to check row condition
        // one pass to check col condition
        // one pass to check 3 * 3 matrix condition 
        for(let i = 0; i<board.length; i++){
            const row_set = new Set();
            const col_set = new Set();
            for(let j = 0; j<board[0].length; j++){
                const row_el = board[i][j];
                if(row_el !== "."){
                if(row_set.has(row_el)){
                    return false;
                }else{
                    row_set.add(row_el)
                }
                }

                const col_el = board[j][i];
                if(col_el !== "." ){
                if(col_set.has(col_el)){
                    return false;
                }else{
                    col_set.add(col_el);
                }
                }
            }
        }

        

        for (let i = 0; i < 9; i += 3) {
    for (let j = 0; j < 9; j += 3) {

        const blockSet = new Set(); 

        for (let l = i; l < i + 3; l++) {
            for (let m = j; m < j + 3; m++) {

                const val = board[l][m];

                if (val !== ".") {

                if (blockSet.has(val)) {
                    return false;
                }else{
                blockSet.add(val);
                }}
            }
        }
    }
}

        // I have to find a way to navigate the grid in a 3 * 3 way

        return true;

    }
}
