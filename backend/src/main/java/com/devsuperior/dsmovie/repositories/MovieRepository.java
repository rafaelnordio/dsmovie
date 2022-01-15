package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepositoryImplementation<Movie, Long> {

}
