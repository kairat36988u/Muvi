import cast.Cast;
import director.Director;
import findable.Findables;
import mune.Movie;
import sortable.SortImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Cast> cast = new ArrayList<>();
        cast.add(new Cast("Joldosov Daniar ", "ters"));
        cast.add(new Cast("Jigitakiev Oroz ", "geroi"));

        ArrayList<Cast> cast1 = new ArrayList<>();
        cast1.add(new Cast("Kairat ", "druzia"));
        cast1.add(new Cast("Keldibek ", "druzia"));

        ArrayList<Cast> cast2 = new ArrayList<>();
        cast2.add(new Cast("Leito ", "peren"));
        cast2.add(new Cast("Leila ", "devushka"));


        LinkedList<Movie> movies = new LinkedList<>();

        movies.add(new Movie("SnaiPer", 2023, "olum", new Director("Ali", "Iskenderov"), cast));
        movies.add(new Movie("Druzia naveki", 2022, "drug", new Director("Nuridin", "Omurzakov"), cast1));
        movies.add(new Movie("Love", 2012, "love", new Director("Shamshi", "Maadilaov"), cast2));

        Findables findables = new Findables();
        SortImpl sort = new SortImpl();
        System.out.println(" _________________________________________");
        System.out.println("|                 MENIU                    |");
        System.out.println("| 1 di basagyz baardyk maalymat chygat     |");
        System.out.println("| 2 ni basagyz kinonun atary chygat        |");
        System.out.println("| 3 tu basagyz kinonyn atyn jazygyz        |");
        System.out.println("| 4 tu basagyz aktiordun atyn mn tan beret |");
        System.out.println("| 5 ti bassagyz oshol jylychykan kinonu    |");
        System.out.println("| 6 ti basagyz derektordun atymn kinonu tbt|");
        System.out.println("| 7 ni basagyz Description aty mn tabat    |");
        System.out.println("| 8 ni basagyz rolun jasagyz taap beret    |");
        System.out.println("| 9 di basanyz kinonyn attaryn sortoit   |");
        System.out.println("| 10 di basanyz kinonynChykanjylyn sortoit|");
        System.out.println("| 11 tu basanuz derectordu sortop beret   |");
        System.out.println(" __________________________________________");

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n");


            System.out.println("         bir sandy tandanyz ");

            int a = sc.nextInt();

            switch (a) {
                case 1 -> {for (Movie d : movies) {System.out.println(d + "\n");}}

                case 2 -> findables.getAllMovies(movies);

                case 3 -> findables.findMovieByName(movies);

                case 4 -> findables.findMovieByActorName(movies);

                case 5 -> findables.findMovieByYear(movies);

                case 6 -> findables.findMovieByDirector(movies);

                case 7 -> findables.findMovieByDescription(movies);

                case 8 -> findables.findMovieByRole(movies);

                case 9 -> sort.sortByMovieName(movies);

                case 10 -> sort.sortByYear(movies);

                case 11 -> sort.sortByDirector(movies);

                default -> System.err.println("Myndai fungsia jok ");


            }
        }


    }
}