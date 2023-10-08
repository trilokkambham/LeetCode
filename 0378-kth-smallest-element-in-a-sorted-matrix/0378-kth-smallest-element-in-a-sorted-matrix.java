class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l=matrix.length*matrix[0].length;
        int[] arr=new int[l];
        int z=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[z]=matrix[i][j];
                z++;
            }
        }
        int temp=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr[k-1];
    }
}