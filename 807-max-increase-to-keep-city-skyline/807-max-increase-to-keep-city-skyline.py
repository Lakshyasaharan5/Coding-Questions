class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        
        ans = 0
        
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                
                row = 0
                maxRow = -1
                
                while(row<len(grid[i])):
                    maxRow = max(maxRow, grid[i][row])
                    row += 1
                
                col = 0
                maxCol = -1
                
                while(col<len(grid[i])):
                    maxCol = max(maxCol, grid[col][j])
                    col += 1
                
                
                ans += min(maxCol, maxRow) - grid[i][j]
                # print(min(maxCol, maxRow))
                 
            
        return ans
                