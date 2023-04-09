//Spiral Matrix
//Implementation/Simulation

  //do not forget to check: ans.size() < totalSize, o/w and may include duplicate items
  public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length -1;
        int left = 0, right = matrix[0].length -1;
        int totalSize = matrix.length * matrix[0].length;

        List<Integer> ans = new ArrayList<>();
         while(left <= right){
            for(int i = left; i <= right && ans.size() < totalSize; i++)
                ans.add(matrix[top][i]);
            top++;

            for(int i = top; i <= bottom && ans.size() < totalSize; i++)
                ans.add(matrix[i][right]);
            right--;

            for(int i = right; i >= left && ans.size() < totalSize; i--)
                ans.add(matrix[bottom][i]);
            bottom--;

            for(int i = bottom; i >= top && ans.size() < totalSize; i--)
                ans.add(matrix[i][left]);
            left++;

         }

         return ans;
    }
