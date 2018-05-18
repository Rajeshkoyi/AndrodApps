package com.example.technokrishna.showtimes

class MoviesData {
    companion object {
        fun moviesList():ArrayList<Movie>{
            var moviesList = ArrayList<Movie>()
            moviesList.add(Movie("Avengers",R.drawable.img_1, Size(800,500)))
            moviesList.add(Movie("WonderWoman",R.drawable.img_2,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_3,Size(900,400)))
            moviesList.add(Movie("Ironman",R.drawable.img_4,Size(600,600)))
            moviesList.add(Movie("Avengers",R.drawable.img_5,Size(500,400)))
            moviesList.add(Movie("Avengers",R.drawable.img_6,Size(1200,100)))
            moviesList.add(Movie("WonderWoman",R.drawable.img_7,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_8,Size(800,200)))
            moviesList.add(Movie("Ironman",R.drawable.img_9,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_10,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_11,Size(800,200)))
            moviesList.add(Movie("WonderWoman",R.drawable.img_12,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_13,Size(800,200)))
            moviesList.add(Movie("Ironman",R.drawable.img_14,Size(800,200)))
            moviesList.add(Movie("Avengers",R.drawable.img_15,Size(800,200)))
            return  moviesList
        }

    }
}