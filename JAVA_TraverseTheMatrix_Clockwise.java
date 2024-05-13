class JAVA_TraverseTheMatrix_Clockwise {
    public static void traverseMatrixClockwise(int n,int[][] matrix){        
        int k=0;
        int i=0,j=0;        
        do{
            while(j<n-(k+1)){
                System.out.println(matrix[i][j]);
                j++;
            }
            while(i<n-(k+1)){
                System.out.println(matrix[i][j]);
                i++;
            }
            k++;
            while(j>=k){
                System.out.println(matrix[i][j]);
                j--;
            }
            while(i>k){
                System.out.println(matrix[i][j]);
                i--;
            }
        }while(k<n-k);
        System.out.println(matrix[i][j]);
    }
    public static void main(String[] args) {
        int dimention=7;
        int[][] matrix={{1,2,3,4,5,26,27},
                        {6,7,8,9,10,28,29},
                        {11,12,13,14,15,30,31},
                        {16,17,18,19,20,32,33},
                        {21,22,23,24,25,34,35},
                        {36,37,38,39,40,41,42},
                        {43,44,45,46,47,48,49}
        };
        traverseMatrixClockwise(dimention,matrix);        
    }
}
