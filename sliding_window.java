public class sliding_window {
    

    public static void main(String[] args) {
        int[] arr={5,8,3,12,45,34,23};

        int k=5;

        int max_sum=0;

        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }

        int cu_sum=0;

 
        for(int i=k;i<arr.length;i++){

            cu_sum=max_sum-arr[i-k]+arr[k];

            if(cu_sum>max_sum){
                max_sum=cu_sum;
            }

        }

        System.out.println(max_sum);



    }
}
