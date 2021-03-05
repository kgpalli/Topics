


public class Practice {



    public static int maxProfit(int[] prices) {
        int max_porfit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int num = prices[j] - prices[i];
                    max_porfit = Math.max(num, max_porfit);
                }
            }
        }


      return max_porfit;
    }


    public static void main(String[]args){

        int [] prices = {7,1,5,3,6,4,7};
        System.out.println(maxProfit(prices));

    }

}
