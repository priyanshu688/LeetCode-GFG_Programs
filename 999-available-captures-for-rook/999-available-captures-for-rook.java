class Solution {
    public int numRookCaptures(char[][] board) {
        //To find position of rook
        int x=0,y=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        int c=0;
        
        //To traverse right
        for(int k=y;k<8;k++){
            if(board[x][k]=='B'){
                break;
            }
            else if(board[x][k]=='p'){
                c++;
                break;
            }
        }
        
        //To traverse left
        for(int k=y;k>=0;k--){
            if(board[x][k]=='B'){
                break;
            }
            else if(board[x][k]=='p'){
                c++;
                break;
            }
        }
        
        //To traverse top
        for(int k=x;k>=0;k--){
            if(board[k][y]=='B'){
                break;
            }
            else if(board[k][y]=='p'){
                c++;
                break;
            }
        }
        
        //To traverse bottom
        for(int k=x;k<8;k++){
            if(board[k][y]=='B'){
                break;
            }
            else if(board[k][y]=='p'){
                c++;
                break;
            }
        }
        return c;
        
        
    }
}