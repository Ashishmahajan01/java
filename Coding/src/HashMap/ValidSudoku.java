package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class ValidSudoku {
	
	
	 static boolean row[][];
	    static boolean col[][];
	    static boolean box[][];
	    public static boolean isValidSudokuOptimize(char[][] board) {
	        
	        row=new boolean[9][10];
	        col=new boolean[9][10];
	        box=new boolean[9][10];
	        System.out.println(Arrays.deepToString(row));
	        System.out.println(Arrays.deepToString(col));
	        System.out.println(Arrays.deepToString(box));
	        int n=9;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(board[i][j]=='.') continue;
	                int d=board[i][j]-'0';
	                int b=(i/3)*3 + j/3;
	                
	                System.out.println(row[i][d]);
	                System.out.println(col[j][d]);
	                System.out.println(box[b][d]);
	                
	                if(row[i][d]) return false;
	                if(col[j][d]) return false;
	                if(box[b][d]) return false;
	                row[i][d]=true;
	                col[j][d]=true;
	                box[b][d]=true;
	            }
	        }
	        return true;
	        
	        
	        
	    }
	
	public static boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows = new HashMap[9];
        HashMap<Integer,Integer>[] cols = new HashMap[9];
        HashMap<Integer,Integer>[] boxes = new HashMap[9];
        
        for(int i=0;i< 9;i++){
            rows[i] = new HashMap<Integer,Integer>();
            cols[i] = new HashMap<Integer,Integer>();
            boxes[i] = new HashMap<Integer,Integer>();
        }
        int num =0;
        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                char n = board[i][j];
                if(board[i][j] != '.'){
                    num =(int)n;
                    int box_index =(i/3)*3 +j/3;
                    rows[i].put(num,rows[i].getOrDefault(num,0)+1);
                    cols[j].put(num,cols[j].getOrDefault(num,0)+1);
                    boxes[box_index].put(num,boxes[box_index].getOrDefault(num,0)+1);

                    if(rows[i].get(num) >1 || cols[j].get(num) >1 || boxes[box_index].get(num) >1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		char arr[][] = { 
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		//isValidSudoku(arr);
		isValidSudokuOptimize(arr);
	}
	

}
