package day25_DateTime_ConstructorsIntro;

import java.time.LocalDate;

/*    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

                    print the full info of the movie*/
public class Task4_TestMovieObjects____err {
    public static void main(String[] args) {
        Task4_Movie CydeoMovie = new Task4_Movie("USA","Java Developer: Zero to Hero", "Kuzzat Altay", LocalDate.of(2021,4,18));
        CydeoMovie.addCast("Ozzy");
        CydeoMovie.addCast("Ali");
        CydeoMovie.addCast("Muhtar");
        System.out.println(CydeoMovie);

    }
}
