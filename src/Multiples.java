public class Multiples {
    public static void main(String[] args) {
        //Prints how many multiples of 3 or 5 are in 1000
        int i = 1;
        int total = 0;
        while (i <= 1000/3)
        {
            boolean m3under1000 = (i * 3) <= 1000;
            boolean m5under1000 = (i * 5) <= 1000;
            boolean m15under1000 = (i * 15) <= 1000;

            //Checks if there are still multiples of 3 and 5 below 1000
            if (m3under1000 && m5under1000) {
                total += 2;
            }

            //Checks for remaining multiples of 3
            else if (m3under1000) {
                total += 1;
            }
            if (m15under1000) {
                total -= 1;
            }
            i += 1;
        }
        System.out.println(total);
    }
}
