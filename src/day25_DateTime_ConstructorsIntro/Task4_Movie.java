package day25_DateTime_ConstructorsIntro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* Task04:
       1. Create a custom class named  Movie:
        Attributes:
        country, title, Genre, releaseDate, director, casts (ArrayList<String>)
        Add a constructor to set the country, title, release date, and director of the Movie
        Actions
        addCast(String): adds the given string argument to the arrayList casts
        addCasts(String[]): adds the given string array argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts*/
public class Task4_Movie {
    public String country, genre, title, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts; //= new ArrayList<>();    // !!!!!!!!!!!here or in line 30 but it must be necessarily instantiated

    public Task4_Movie(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
//        this.genre = genre;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
//        this.casts = casts;
        casts = new ArrayList<>();             // todo    !!!!!!!!!!!  in order to use arraylist must be created all the time without this no error but it doesn't work(or in line 21)
    }
    public void addCast(String Cast){
        casts.add(Cast);
    }
    public void addCasts(String [] array){
        casts.addAll(Arrays.asList(array));
//        for (String s : array) {
//            casts.add(s);
//        }
    }

    public String toString() {
        return "Task4_Movie{" +
                "country='" + country + '\'' +
//                ", genre='" + genre + '\'' +
                ", title='" + title + '\'' +
//                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ",total number of casts=" + casts.size() +
                '}';
    }
}
