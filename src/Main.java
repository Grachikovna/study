public class Main {
    public static void main(String[] args) {
        //task 1
        byte b = 15;
        short s = 2045;
        int i = 58674857;
        long l = 85764983576L;
        float f = 12.6F;
        double d = 320.5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //task 2
        double a = 27.12;
        long c = 987_678_965_549L;
        float k = 2.786F;
        int t = 569;
        short h = -159;
        char g = 27897;
        byte r = 67;

        //task 3
        byte ma = 23;
        byte ri = 27;
        byte na = 30;
        short total = 480;
        System.out.println(total/(ma + ri + na ));
        System.out.println("На каждого ученика рассчитано " + " листов бумаги" + " 6 штук" );

        //task 4
        byte performanceIn2minutes = 16;
        byte performance = (byte) (performanceIn2minutes / 2);
        byte perf20min = (byte) (performance * 20);
        int perf24hour = performance * 60 * 24;
        int perf3days = perf24hour * 3;
        int perfMonth = perf24hour * 30;
        //sout

    }
}