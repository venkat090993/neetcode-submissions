class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        const row = board.length;
        const col = board[0].length;
        for(let i = 0; i<row; i++){
            const rowSet = new Set();
            const colSet = new Set();
            for(let j = 0; j <col; j++){
                const rowEl = board[i][j];
                const colEl = board[j][i];
                if(rowEl !== "."){
                    if(rowSet.has(rowEl)){
                        return false;
                    }else{
                        rowSet.add(rowEl);
                    }
                }

                if(colEl !== "."){
                    if(colSet.has(colEl)){
                        return false;
                    }else{
                        colSet.add(colEl);
                    }
                }
            }
        }

        const gridSize = 3;

        for(let blockRow = 0; blockRow < row; blockRow+=gridSize){
            for(let blockCol = 0; blockCol < col; blockCol+=gridSize){

                const blockSet = new Set();

                for(let innerRow = blockRow; innerRow < blockRow + gridSize; innerRow++){
                    for(let innerCol = blockCol; innerCol< blockCol + gridSize; innerCol++){
                        const curr = board[innerRow][innerCol]
                        if(curr !== "."){
                            if(blockSet.has(curr)){
                                return false;
                            }else{
                                blockSet.add(curr);
                            }
                        }
                    }
                }

            }
        }

        return true;
    }
}
