public class Main {
    public static void main(String[] args) {
        String fname = "problem.dat";
        long s = -1;

        if ( args.length == 2 ) {
            s = Integer.valueOf(args[0]).intValue();
            fname = args[1];
        }
        if ( args.length == 1 ) {
            fname = args[0];
        }

        TinyGP gp = new TinyGP(fname, s);
        gp.evolve();
    }
}