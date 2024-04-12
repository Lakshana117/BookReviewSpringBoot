package com.lakshana.bookreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lakshana.bookreview.model.Book;
import com.lakshana.bookreview.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r.book FROM Review r WHERE r.rating > :rating")
    List<Book> findBooksByRatingGreaterThan(@Param("rating") float rating);

}
