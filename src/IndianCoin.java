import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coin[] = {2000,500,100,50,20,10,5,2,1};

        Arrays.sort(coin, Comparator.reverseOrder());

        int count=0;
        int amount=590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0;i< coin.length;i++){
            if (coin[i] <= amount){
                while (coin[i] <= amount){
                    count++;
                    ans.add(coin[i]);
                    amount-=coin[i];

                }
            }
        }
        System.out.println(count);
       for (int i=0;i< ans.size();i++){
           System.out.print(ans.get(i)+" ");
       }
    }
}
