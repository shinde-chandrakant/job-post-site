package com.cs.joblisting.repository;

import com.cs.joblisting.model.JobPost;

import java.util.List;

public interface SearchRepo {
    List<JobPost> findByText(String text);
}
