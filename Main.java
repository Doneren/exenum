public class Main {
    enum Monthes {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE}

    public static void main (String ... args){
        Monthes month = Monthes.JANUARY;
        if (month == Monthes.JANUARY) {
            System.out.println("JAN");
        } else {
            System.out.println("not JAN");
        }

        System.out.println(month + " is cold month!");
    }



}
