package GuavaTools;

import java.util.*;

public class Guava {

    public void Notes(){
        /* 
         * Charater.isWhitespace(text.charAt(i)) || isSpaceChar => boolean value
         * 
         */
    }

    public void upHorizontalPyramidNumber(int n){
        
        /*UP to Down */
        int num=1;
        for(int i = 0 ; i< n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(num);
                if(j<i)
                System.out.print("*");
                num++;
            }
            System.out.println("");
        }

        /*Down to UP */
        int temp;
        for(int i=n;i>=1;i--){
            temp=num-i;
            num=temp;
            for(int j=1; j<=i ; j++){
                System.out.print(temp);
                if(j<i)
                System.out.print("*");
                temp++;
            }
            System.out.println("");
        }
    }

    public boolean[] allPrimeTillN(int n) {

        //SieveOfEratosthenes
        boolean[] primes = new boolean[n + 1];

        for (int i = 2; i < primes.length; i++) 
            primes[i] = true;
        
        int num = 2;
        while (true) {
            for (int i = 2;; i++) {
                int multiple = num * i;
                if (multiple > n) 
                    break;

                else 
                    primes[multiple] = false;
            
            }
        
            boolean nextNumFound = false;
            
            for (int i = num + 1; i < n + 1; i++) {
                if (primes[i]) {
                    num = i;
                    nextNumFound = true;
                    break;
                }
            }

            if (!nextNumFound) 
                break;
            
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) 
                System.out.println(i);
        }
        return primes;
    }

    public boolean checkAnagram(String s1,String s2){
        /* By array use 
         * char[] arr1 = s1.replaceAll("\\s","").toLowerCase.toCharArray(); 
         * Arrays.sort(arr1) then Arrays.equals(arr1,arr2)
         * OR  
         * for (int i = 0; i < arr1.length; i++)
             xor ^= arr1[i] ^ arr2[i];
         * return xor == 0? true: false;
         * OR
         * ArrayList
         * List<Character> list1 = new ArrayList<Character>();
         * list1.add(s1.charAt(i)) => then Collection.sort(list1) => list1.equals(list2) ? True or False
         */ 
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length())
            return false;
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i =0 ; i<s1.length();i++){
            char c = s1.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else 
                map.put(c,1);
        }

        for(int i =0 ; i<s2.length(); i++){
            char c = s2.charAt(i);
            if(map.containsKey(c))
                {
                    if(map.get(c)==1)
                        map.remove(c);
                    else 
                        map.put(c,map.get(c)-1);
                }
            else 
                return false;
        }

        if(map.size()>0)    
            return false;
        
        return true;
    }
   
    public double squareRoot(int num){
        /* Use 
        * Math.sqrt(num) or Math.pow(num,0.5) */
        double result;
        result=Math.pow(num,0.5);
        // It can be Double.NAN || POSITIVE_INFINITY
        return result;
    }
    
    public static int[] convertIntTOIntArray(int number){
        // This method convert int to an integer array 
        // int number = 110101; 
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        return numbers;
    }
    
    public static int convertIntAtoInt(int[] num){
        //This method convert intArray to int 
        return 0;
    }

    public static long FactorialCalculator(int num){
        //Factorial of number
    //  In main function table[number] will show the factorial
    //   long[] table = Fact(); 
        long[] fact_table = new long[21];
        fact_table[0] = 1;
        for(int i=1; i<fact_table.length; i++){
            fact_table[i] = fact_table[i-1] * i;
        }
        return fact_table[num];

        // or use this simply Fact(num)
        // reduce() operation is parallelizable if the function used to process the elements is associative
        // return LongStream.rangeClosed(1,n).reduce(1, (long num1, long num2) -> num1*num2);
        

        // return BigIntegerMath.factorial(n);
    }

    public long sumFact(int num){
        // The method convert number to sum of factorial of all individual numbers
        int[] temp = convertIntTOIntArray(num);
        long sum=0;
        for (int i = 0; i < temp.length; i++) {
            sum += FactorialCalculator(temp[i]);
        } return sum;
    }
    public static void main(String args[]){
        System.out.println("This Is The GuavaGOOLS of GSO");
    }
}
