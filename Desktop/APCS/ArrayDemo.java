public class ArrayDemo {


    public static void main(String[] args) {


    //Test Cases
    int[] testArray = {1,2,3,4};
    
    int[][] test2DArray1 = new int[][]{
        {1,-456,3,0},
        {5,-1,7,8},
        {9,10,-11,12},
        };
       
    int[][] test2DArray2 = new int [][]{
        {33},
        {-47},
        {0},
        {0},
        {-1},
        };
        
    
    //Call Functions
    printArray(testArray);
    printArray(test2DArray1);
    countZeros2D(test2DArray1);
    //printArray(fill2D(test2DArray2)); //Print Test
    printArray(fill2DCopy(test2DArray1)); //Print Test
    fill2DCopy(test2DArray
}

    
    
    
    //Prints a 1D Array
    public static void printArray(int[] ary){
        

        
        System.out.print("{");
        for(int i = 0; i < ary.length; i++){
            System.out.print(ary[i]);
            System.out.print(",");
        }
         System.out.print("\b}");
         System.out.println();
    }

    
    public static void printArray(int[][] ary){
    
        int row = ary.length;
        int col = ary[0].length;
        System.out.println("{");
        
        for(int i = 0; i < row; i++){
            
            System.out.print("{");
            
            for(int j = 0; j < col; j++){
            
            System.out.print(ary[i][j]);
            System.out.print(",");
            }
            System.out.print("\b");
            System.out.println("},");
            
        }
        System.out.println("}");
    }

    public static int countZeros2D(int[][] nums){
        
        int row = nums.length;
        int col = nums[0].length;
        int counter = 0;
        
        for(int i = 0; i < row; i++){
            
            for(int j = 0; j < col; j++){
                
                if(nums[i][j] == 0){
                    counter++;
                }
            }
       }
       //System.out.println(counter);  //Check
       return counter;
  
    }
    
    public static void fill2D(int[][] vals){
    
        for(int i = 0; i < vals.length; i++){
            for(int j = 0; j < vals[0].length; j++){
                if(i == j){
                    vals[i][j] = 3;
                }
                else{
                    vals[i][j] = 1;
                }
            }
        }
    }
    
    public static int[][] fill2DCopy(int[][] vals){
    
        int[][] new2DArray = new int[vals.length][vals[0].length];
        
        for(int i = 0; i < vals.length; i++){
            for(int j = 0; j < vals[0].length; j++){
                if(vals[i][j] < 0){
                    new2DArray[i][j] = 3;
                }
                else{
                    new2DArray[i][j] = 1;
                }
            }
        }
        return new2DArray;
    }
    
}

