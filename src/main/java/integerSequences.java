public class integerSequences {
    private static String firstArg;
    private static int secondArg;

    private static int lazyCatererSequence(int n) {
        n = (n^2 + n + 2) / 2;
        return n;
    }

    private static int triangleNumberSequence(int n) {
        n = n * (n+1) / 2;
        return n;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            // TODO: show how to execute program properly
            System.out.println("Please input program properly");
            System.exit(1);
        }
        firstArg = args[0];
        try {
            secondArg = Integer.parseInt(args[1]);
        }
        catch (Exception e) {
            System.out.println("Please enter a 32 bit intger for the second argument.");
            System.exit(1);
        }
        if (firstArg.equals("lazy")) {
            int n = lazyCatererSequence(secondArg);
            System.out.println("Lazy(" + secondArg + ") = " + n);

        }
        else if (firstArg.equals("triangle")) {
            int n = triangleNumberSequence(secondArg);
            System.out.println("Tri(" + secondArg + ") = " + n);

        }
        else {
            System.out.println("Please input 'lazy' or 'triangle' for the first argument.");
            System.exit(1);
        }
        System.exit(0);
    }
}
