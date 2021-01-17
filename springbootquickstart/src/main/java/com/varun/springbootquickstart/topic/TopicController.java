package com.varun.springbootquickstart.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return Arrays.asList(
                new Topic("Spring Framework", "Spring Framework course", "Spring Framework course Description"),
                new Topic("Java", "Java course", "Java course Description"),
                new Topic("Python", "Python course", "Python course Description")
        );
    }
}
