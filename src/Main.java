public class Main {
    public static void main(String[] args) {
       int number1=220;
       int number2=284;
       int number1_divisors_sum=0;
       int number2_divisors_sum=0;

        for (int i=1;i<number1;i++){
              if (number2%i==0) {
                  number1_divisors_sum=number1_divisors_sum+i;
              }
        }
        for (int j=1;j<number2;j++){
            if (number2%j==0)
            {
                number2_divisors_sum=number2_divisors_sum+j;
            }

        }
        if (number1_divisors_sum==number2&&number2_divisors_sum==number1){
            System.out.println("Friend Numbers");
        }
        else {
            System.out.println("Its not a Friend Numbers");
        }
    }
}