package findable;

import mune.Movie;

import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Movie>movies);
    void findMovieByName(List<Movie>movies) throws Exception;
    void findMovieByActorName(List<Movie>movies);
    void findMovieByYear(List<Movie>movies);
    void findMovieByDirector(List<Movie>movies);
    void findMovieByDescription(List<Movie>movies);
    void findMovieByRole(List<Movie>movies);


}
