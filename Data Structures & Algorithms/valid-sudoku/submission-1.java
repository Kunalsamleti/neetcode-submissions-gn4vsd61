class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            Set<Integer> rowset=new HashSet<>();
            Set<Integer> colset=new HashSet<>();
            int rowcount=0;
            int colcount=0;
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    rowset.add(board[i][j]-'0');
                    rowcount++;
                }
                if(rowcount!=rowset.size()){
                    return false;
                }
                if(board[j][i]!='.'){
                    colset.add(board[j][i]-'0');
                    colcount++;
                }
                if(colcount!=colset.size()){
                    return false;
                }          
            }
        }
        for(int k=0;k<9;k++){
            Set<Integer> squset=new HashSet<>();
            int count=0;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='.'){
                        continue;
                    }
                    if(((i/3)*3+(j/3))==k){
                        squset.add(board[i][j]-'0');
                        count++;
                    }
                }
            }
            if(count!=squset.size()){
                return false;
            }
        }
        return true;
    }
}