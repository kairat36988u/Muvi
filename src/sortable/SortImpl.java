package sortable;

import director.Director;
import mune.Movie;

import java.util.Comparator;
import java.util.List;

public class SortImpl implements Sortable {

    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(metodSort);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(metodSort2);
        for (Movie r : movies) {
            System.out.println(r);

        }

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(metodSort3);
        for (Movie w : movies) {
            System.out.println(w);
        }

    }

    Comparator<Movie> metodSort = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }

    };
    Comparator<Movie> metodSort2 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }

    };
    Comparator<Movie> metodSort3 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }

    };
}
