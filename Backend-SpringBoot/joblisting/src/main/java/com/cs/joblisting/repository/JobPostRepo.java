package com.cs.joblisting.repository;

import com.cs.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepo extends MongoRepository<JobPost, String> {


}
