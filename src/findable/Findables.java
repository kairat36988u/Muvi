package findable;

import cast.Cast;
import mune.Movie;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Findables implements Findable {


    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie d : movies) {
            System.out.println(d.getName());
        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" kinonun atyn jazygyz ");
        String a = sc.nextLine();

        for (Movie d : movies) {
            if (a.equals(d.getName())) {
                System.out.println(d);

            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Aktiordun atyn berigiz ");
        String a = sc.nextLine().toLowerCase();
        for (Movie d : movies) {
            for (Cast cast1 : d.getCast()) {
                if (cast1.getActorFullName().toLowerCase().contains(a)) {
                    System.out.println(d.toString());
                }
            }
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kinonun chykan jylan jazygyz ");
        int a = sc.nextInt();
        for (Movie r : movies) {
            if (r.getYear() == a) {
                System.out.println(r);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Derektordun atyn berigiz ");
        String a = sc.nextLine().toLowerCase();
        for (Movie d : movies) {
            if (d.getDirector().getName().toLowerCase().contains(a)) {
                System.out.println(d.toString());
            }
        }


    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Description nun berigiz ");
        String a = sc.nextLine().toLowerCase();
        for (Movie d : movies) {
            if (d.getDescription().toLowerCase().contains(a)) {
                System.out.println(d.toString());
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Poliun berigiz ");
        String a = sc.nextLine().toLowerCase();
        for (Movie d : movies) {
            for (Cast cast1 : d.getCast()) {
                if (cast1.getRole().toLowerCase().contains(a)) {
                    System.out.println(d.toString());
                }
            }
        }


    }
}
