package com.cs.joblisting.controller;

import com.cs.joblisting.model.JobPost;
import com.cs.joblisting.repository.JobPostRepo;
import com.cs.joblisting.repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/JobPost")
public class JobPostController {

    @Autowired
    JobPostRepo jobPostRepo;

    @Autowired
    SearchRepo searchRepo;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<JobPost>> getAll(){
        return ResponseEntity.ok(this.jobPostRepo.findAll());
    }

    @GetMapping("/{text}")
    @CrossOrigin
    public ResponseEntity<List<JobPost>> search(@PathVariable String text){
        return ResponseEntity.ok(searchRepo.findByText(text));
    }

    @PostMapping("/")
    @CrossOrigin
    public ResponseEntity<JobPost> addJobPost(@RequestBody JobPost jobPost){
        return ResponseEntity.ok(jobPostRepo.save(jobPost));
    }
}
