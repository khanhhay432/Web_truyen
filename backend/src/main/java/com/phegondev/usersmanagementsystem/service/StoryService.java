package com.phegondev.usersmanagementsystem.service;


import com.phegondev.usersmanagementsystem.entity.Story;
import com.phegondev.usersmanagementsystem.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }
}

