package com.phegondev.usersmanagementsystem.repository;


import com.phegondev.usersmanagementsystem.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
}

