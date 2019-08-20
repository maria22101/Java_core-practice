package strings;

public class CommandLineArgs {
    public static void main(String[] args) {
        String phoneDirectory[][] = {
                {"Mari", "217-44-44"},
                {"Mark", "317-55-55"},
                {"Monica", "417-66-66"},
                {"Michele", "517-77-77"}
        };
        boolean found = false;

        if (args.length !=1) {
            System.out.println("To use the program enter a name in the Command line");
        }else {
            for (String s[] : phoneDirectory) {
                if (s[0].equals(args[0])) {
                    System.out.println("Phone number of " + args[0] + " is " + s[1]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No such name found");
            }
        }
    }
}
