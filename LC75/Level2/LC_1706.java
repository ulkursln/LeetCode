//1706. Where Will the Ball Fall
//Implementation/Simulation

public int[] findBall(int[][] grid) {
        int col = grid[0].length;
        int row = grid.length;
        int[] ans = new int[col];
        Arrays.fill(ans, -2);

        int pos= 0;

        for(int i = 0; i < col; i++){
            pos = i;
            for(int j = 0; j < row; j++){
                int val=grid[j][pos];
                if((pos+1 < col && val ==1 && grid[j][pos+1] == -1) || 
                   (pos-1 >= 0 && val ==-1 && grid[j][pos-1] == 1) ||
                   ( pos + val < 0 || pos+val >= col))               
                {
                    ans[i] = -1;
                    break;
                }
           
                pos = pos+val;
                
            }
            ans[i]= ans[i]==-2?pos: ans[i];
        }

        return ans;
    }

//simplfy if condition:
public int[] findBall(int[][] grid) {
        int col = grid[0].length;
        int row = grid.length;
        int[] ans = new int[col];
        Arrays.fill(ans, -2);

        int pos= 0;

        for(int i = 0; i < col; i++){
            pos = i;
            for(int j = 0; j < row; j++){
                int val=grid[j][pos];
                if( pos + val < 0 || pos+val >= col || grid[j][pos+val] != val)    
                {
                    ans[i] = -1;
                    break;
                }
           
                pos = pos+val;
                
            }
            ans[i]= ans[i]==-2?pos: ans[i];
        }

        return ans;
    }
