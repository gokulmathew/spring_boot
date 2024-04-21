package javabrains;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() { return topicService.getAllTopics();
	}
	
//	@RequestMapping("/topics")
//	public List<Topic> retrieveAllCourses() {
//		return Arrays.asList(
//		new Topic (1, "Java Brains", "in28minutes"), new Topic(2, "Learn DevOps", "in28minutes"), new Topic(3, "Learn DevOps", "in28minutes")
//		);
//		}

}
