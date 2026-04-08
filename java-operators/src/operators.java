public class operators {

        public static void main(String[] args) {
            // as
            byte no1 = 100;
            byte no2;
            no2 = no1;
            System.out.println(no2);
            int res = 10 +  (20 - 30)  * 40 / 50 % 60;
            System.out.println(res);
            byte b1 = 127;
            byte b2 = 127;
            short res1 = ( short )(b1 + b2);
            System.out.println(res1);

            int num1 = 334555777;
            int num2 = 345556777;
            long res2 = num1 + num2;
            System.out.println(res2);

            num1  = 10;
            num2 = 20;
            res2 = --num1 + num2++ + --num1 + ++num2;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(res2);

            num1 = 100;
            num2 = 200;
            if(--num1 > 50 && ++num2 > 50 );

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(--num1 > 50 && ++num2 > 50);


            if(--num1 > 500 || ++num2 >500);
            System.out.println(--num1 > 50 || ++num2 >500);




        }
    }

