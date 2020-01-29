package com.myTube.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myTube.Entities.Video;

public interface VideoRepo extends JpaRepository<Video, Integer>{

}
