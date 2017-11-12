public class Homework2_28723116565 {

// IN THIS HOMEWORK, DO NOT USE ARRAY AND ARRAYLIST.

    public static void main(String[] args) {
            //DO NOT DO ANY WORK IN MAIN METHOD
            int grade=0;
            if(SumOfNumbersBetweenTwoNumbers(50,100)== 3825)
                grade+=5;
            if(SumOfOddNumbersBetweenTwoNumbers(100,200)== 7500)
                grade+=5;
            if(AvarageOfFourNumbers(20,25,30,40)== 28.75)
                grade+=5;
            if(MinimumOfThreeNumbers(5,8,7)== 5)
                grade+=5;
            if(isPrimePalindrome(151))
                grade+=15;
            if(NumberOfLowerCase("Java is Fun")== 7)
                grade+=10;
            if(isTriangle(4,5,6))
                grade+=10;
            if(ReverseOfString("HELLO").equals("OLLEH"))
                grade+=15;
            if(SumOfDigits(457) == 16)
                grade+=10;
            if(checkPassword("ABCD1234+"))
                grade+=20;

            System.out.print("Your Grade is->"+grade);
        }


        public static int SumOfNumbersBetweenTwoNumbers(int a,int b){
            int sum=0;
            for(int i=a;i<=b;i++ ){
            sum +=i;
            }
            return sum;
        }


        public static int SumOfOddNumbersBetweenTwoNumbers(int a,int b){
         int sum=0;
         int number=101;
         for (number=101;number<=199;number+=2){
          sum=sum+number;
         }
            return sum;
        }

        public static double AvarageOfFourNumbers(int a,int b,int c,int d){
            double sum=0;
            if(a+b<c+d){
                sum = a+b+c+d;
            }
            return sum/4;
        }

        public static int MinimumOfThreeNumbers(int a,int b,int c){
        if (c-a > b-a  )
            return c;
        else if ( b-a < c-a )
            return b;
        else
            return a;
        }


        public static Boolean isPrimePalindrome(int a){

            boolean sonuc;
            int n =0;
            int number=0;
            int toplam=0,sayic=number;
            while(number>=1) {

                int x=number%10;
                int ust =(int) Math.pow(10, n-1);
                toplam =toplam+x*ust;
                n--;
                number=number/10;
            }

            if(toplam==sayic){
                sonuc=true;

            } else{
                sonuc=false;
            }
            return sonuc;
        }
        public static int NumberOfLowerCase(String s){


            int numberOfLowerCase = 0;
            for (int i = 0; i < s.length(); i++) {

                if (Character.isLowerCase (s.charAt(i)))
                    numberOfLowerCase++;
            }
            return numberOfLowerCase;
        }
    public static boolean isTriangle(int a,int b,int c) {

if ( (a+b)<=c || (b+c)<=a || (a+c)<=b )
    return false;
else
    return true;

        }

        public static String ReverseOfString(String s){

            String reverse = "";
            int length = s.length();
            for( int i = length - 1 ; i >= 0 ; i-- ) {
                reverse = reverse + s.charAt(i);
            }
            return reverse;
        }

        public static int SumOfDigits(int a) {

            int temp = (int)Math.abs(a);
            int sum = 0;

            while(temp != 0){
                sum += (temp % 10);
                temp = temp / 10;
            }
            return sum;
        }

        public static  Boolean checkPassword(String s){
            String str="Hüseyin";
            boolean b= str.contains ( "*" );
            if ( s.length ()>=9 )
                return true;
            else
                return false;


        }
    public static boolean hasNDigits(String password, int n) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
        }
        return false;
    }
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }
    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_VALID_PASSWORD = 9;
        final int MINIMUM_NUMBER_OF_DIGITS = 0;

        boolean validPassword =
                isLengthValid(password, LENGTH_OF_VALID_PASSWORD) &&
                        isOnlyLettersAndDigits(password) &&
                        hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

        return validPassword;
    }
}







