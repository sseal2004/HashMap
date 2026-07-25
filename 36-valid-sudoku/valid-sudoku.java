class Solution {
    public boolean isValidSudoku(char[][] board) {
        //valid row 
        for(int row=0;row<9;row++){
         HashSet<Character>set= new HashSet<>();
            for(int col=0;col<9;col++){
                char item = board[row][col];
                if(item =='.') continue;
                if(!set.add(item))return false;//if item is not there in set
            }
        }
        //valid column
            for(int col=0;col<9;col++){
         HashSet<Character>set= new HashSet<>();
            for(int row=0;row<9;row++){
                char item = board[row][col];
                if(item =='.') continue;
                if(!set.add(item))return false;//if item is not there in set
            }
        }
        //valid boxes 
        // so every small grid is 3X3
        for(int sr = 0;sr<9;sr+=3){
            int er = sr+2;
            for(int sc = 0;sc<9;sc+=3){
                int ec = sc+2;
                if(!validBox(board,sr,sc)) return false;
            }

        }
        return true;

    }
    static boolean validBox(char[][]board,int startRow,int startCol){
                 HashSet<Character>set= new HashSet<>();
                 //traversal
                 for(int i=startRow;i<startRow+3;i++){
                    for(int j=startCol;j<startCol+3;j++){
                        char item= board[i][j] ;
                        if(item =='.') continue;
                        if(!set.add(item))return false;
                    }
                 }
                 return true;

    }
}