
import java.lang.String;

public class Main
{
	public static void main(String[] args) {
		System.out.println(minSplit(75));
	}
	
        public static int minSplit(int amount) {
           int[] arr= {1, 5, 10, 20, 50};
            int n=0;
            int am = amount;
            while(am>0){
                int i=4;
                while(i>0){
                    if(arr[i]<=am){
                        am=am-arr[i];
                        n++;
                        break;
                    }
                    i--;
                }
                 
            }
            return n;
        }
}

