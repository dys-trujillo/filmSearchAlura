public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to ScreenHatcher!");
        System.out.println("Film: Interstellar");

        int year = 2014;
        boolean planIncluded = true;
        double filmGrade = 8;
        System.out.println("Release date: " + year);
        if (planIncluded) {
            System.out.println("Included in your plan");
        }
        else {
            System.out.println("Not included in your plan");
        }

        double avg = (9.8 + 8 + 6.3) /3;
        System.out.println(avg);
        String synopsis;
        synopsis = """
                Science Fiction
                Moon, stars, time and space.""";
        System.out.println(synopsis);

    }
}