public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to ScreenHatcher!");
        System.out.println("Film: Interstellar");

        int year = 2014; //planning to use API to get this info
        boolean planIncluded = true;
        double filmGrade = 8; //planning to use API to get this info
        System.out.println("Release date: " + year);
        if (planIncluded) {
            System.out.println("Included in your plan");
        }
        else {
            System.out.println("Not included in your plan");
        }

        double avg = (9.8 + 8 + 6.3) /3;
        System.out.println(avg);
        String synopsis; //planning to use API to get this info
        synopsis = """
                Science Fiction
                Moon, stars, time and space.""";
        System.out.println(synopsis);

        int stars = (int) (avg/2);

        System.out.println("""
                Estrelas:""");
        System.out.println(stars);

    }
}