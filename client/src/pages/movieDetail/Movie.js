import React, { useEffect, useState } from "react";
import "./Movie.css";
import { useParams } from "react-router-dom";
import MovieDetailInfo from "../../components/movieDetails/MovieDetailInfo";

const Movie = () => {
    const [currentMovieDetail, setMovie] = useState();
    const { id } = useParams();

    useEffect(() => {
        getData();
        window.scrollTo(0, 0);
        // eslint-disable-next-line react-hooks/exhaustive-deps
    }, []);

    const getData = () => {
        fetch(`https://api.themoviedb.org/3/movie/${id}?api_key=80fc8b1a0b8b75ffea2dfddf157187e1&language=en-US`)
            .then((res) => res.json())
            .then((data) => setMovie(data));
    };

    return (
        <div>
            <MovieDetailInfo movie />
        </div>
    );
};

export default Movie;
