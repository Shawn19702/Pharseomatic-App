public class Phraseomatic {
    public static void main(String[] args) {
        String[] favoriteCars = {"Lamborghini",
                "Audi",
                "Nissan",
                "Toyota",
                "Bugatti",
                "BMW",
                "Ferrari",
                "Tesla",
                "Chrysler",
                "Honda",
                "Ford",
                "Mercedes",
                "Chevy",
                "Lexus",
                "Jeep"
        };
        String[] favoriteRappers = {"Tupac", "Kanye", "Lil Wayne", "Lil Baby", "Gunna", "Travis Scott", "Rod Wave",
                "Future",
                "Offset",
                "Biggie",
                "Lauryn Hill",
                "Kendrick Lamar",
                "J Cole", "Young Thug",
                "Lil Uzi Vert",
                "21 Savage"
        };

        String[] favoriteBasketballPlayers = {"Kyrie Irving",
                "Kobe Bryant",
                "Lebron James",
                "Kevin Durant",
                "Micheal Jordan",
                "Shaquille O'Neal",
                "Larry Bird", "Tim Duncan",
                "Bill Russel",
                "Magic Johnson",
                "Stephen Curry",
                "Allen Iverson",
                "Jerry West",
                "Charles Barkley",
                "Dwayne Wade"
        };
        int Length1 = favoriteCars.length;
        int Length2 = favoriteRappers.length;
        int Length3 = favoriteBasketballPlayers.length;

        int num1 = (int) (Math.random()* Length1);
        int num2 = (int) (Math.random()* Length2);
        int num3 = (int) (Math.random()* Length3);

        String N = favoriteCars[num1] + " " + favoriteRappers[num2] + " " + "and" + " " + favoriteBasketballPlayers[num3];

        System.out.println("My Favorite car, rapper, and basketball player are " + N);









    }
}
