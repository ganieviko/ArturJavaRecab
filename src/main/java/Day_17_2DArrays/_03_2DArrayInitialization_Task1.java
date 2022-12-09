package Day_17_2DArrays;

import java.util.Arrays;

public class _03_2DArrayInitialization_Task1 {
    // given following arrays
    // create two dimensional array to hold all the movies
    // count the number of movies => 8 movies
    // count the number of characters in each movie name
    public static void main(String[] args) {
        String[] comics = {"Marvel", "DC"};
        String[] fiction = {"The Lord of the rings", "Star war", "Harry Potter"};
        String[] classics = {"War and peace", "Anna Karenina", "Faust"};

        String[][] allMovies = {{"Marvel", "DC"}, {"The Lord of the rings", "Star war", "Harry Potter"},{"War and peace", "Anna Karenina", "Faust"}};

        int totalCount = 0;
        for (int i = 0; i < allMovies.length; i++) {
            totalCount += allMovies[i].length; // number of movies inside the list
        }
        System.out.println("Total amount of movies is " +  totalCount);

        for (int i = 0; i < allMovies.length; i++) {

            for (int j = 0; j < allMovies[i].length; j++) {
                String movies = allMovies[i][j];
                System.out.println(movies + " -> " + movies.length());
            }

        }
    }
}

