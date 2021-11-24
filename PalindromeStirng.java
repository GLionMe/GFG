class Complete{
    
   
    // Function for finding maximum and value pair
    public static boolean pallan (int n) {
        int loop = 0;
        int temp = n;
    
        while(temp == 0) {
            loop += (temp % 10);
            temp /= 10;
        }
    
        String subsequence = "";
        String[] num = String.valueOf(n).split("");
    
        for(int i = 0;i < num.length;++i) {
            subsequence += ((char)(Integer.parseInt(num[i]) + 97));
        }
    
        String sequence = "";
    
        for(int i = 0;i < loop;++i) {
            sequence += subsequence;
        }
    
        String reverse = String.valueOf(new StringBuffer(sequence).reverse());
    
        return sequence.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(pallan(1998));
    }
    
    
}