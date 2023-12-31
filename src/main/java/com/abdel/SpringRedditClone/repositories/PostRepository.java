package com.abdel.SpringRedditClone.repositories;

import com.abdel.SpringRedditClone.entities.Post;
import com.abdel.SpringRedditClone.entities.Subreddit;
import com.abdel.SpringRedditClone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subReddit);

    List<Post> findByUser(User user);
}
