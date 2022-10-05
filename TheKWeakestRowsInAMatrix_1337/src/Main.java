public class Main {
    public static void main(String[] args) {
    }
    class Solution {
        public void swap(int[] arr, int v1, int v2){
            int t = arr[v1];
            arr[v1] = arr[v2];
            arr[v2] = t;
        }

        public int sum(int[] arr){
            int sum =0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }
        public int[] kWeakestRows(int[][] mat, int k) {
            int kweekest[] = new int[k];
            int sum[] = new int[mat.length];
            int sorted[]=new int[mat.length];

            for(int i = 0; i<sorted.length; i++){
                sorted[i]=i;
                sum[i] = sum(mat[i]);
            }

            for(int i=0; i<(sorted.length-1); i++){
                int min_idx = i;
                for(int j=i+1; j<sorted.length; j++){
                    if(sum[sorted[min_idx]]==sum[sorted[j]] && sorted[min_idx]>sorted[j]){
                        min_idx = j;
                    }else if(sum[sorted[j]] < sum[sorted[min_idx]]){
                        min_idx = j;
                    }
                }
                if(min_idx != i){
                    swap(sorted, min_idx, i);
                }
            }
            for(int i = 0; i<k; i++){
                kweekest[i] = sorted[i];
            }
            return kweekest;
        }
    }
}