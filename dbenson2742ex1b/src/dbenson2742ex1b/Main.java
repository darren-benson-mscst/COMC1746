package dbenson2742ex1b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
        System.out.println("t1: (Default constructor)        " + t1);

        Time t2 = new Time(5, 29);
        System.out.println("t2: (Parameterized constructor)  " + t2);

        Time t3 = new Time(5, 5);
        System.out.println("t3: (Parameterized constructor)  " + t3);

        Time t4 = t2.copy();
        System.out.println("t4: (Copy of t2)                 " + t4);

        Time t5 = new Time(t2);
        System.out.println("t5: (Copy using copy constructor " + t5);


        if (t5 == t2)
            System.out.println("Compare using == operator: t5 == t2");
        else
            System.out.println("Compare using == operator: t5 != t2");

        if (t2.equals(t5))
            System.out.println("Compare using Time.equals(): t5 equals t2");
        else
            System.out.println("Compare using Time.equals(): t5 is not equal to t2");

        Time t6 = t2; // Copy object reference
        if (t6 == t2)
            System.out.println("Reference copied: t6 == t2");
        else
            System.out.println("Reference copied: t6 != t2");

        Time t7 = new Time(2, 125);
        System.out.println("t7: Call 'simplify()'            " + t7);

        Time t8 = new Time(0, -20);
        System.out.println("t8: Test validation              " + t8);
	}

}
