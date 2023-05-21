package aula12.ex03;

import java.util.Objects;

public class Movie {
    String title; double score; String rating; String genre; int runtime;

    public Movie(String title, double score, String rating, String genre, int runtime) {
        this.title = title;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.score, score) == 0 && runtime == movie.runtime && Objects.equals(title, movie.title) && Objects.equals(rating, movie.rating) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, score, rating, genre, runtime);
    }

    @Override
    public String toString() {
        return  title + ", " + genre + ", " + runtime + " minutes"+
                "\nScore: " + score + ", Rating: " + rating + "\n";
    }
}
