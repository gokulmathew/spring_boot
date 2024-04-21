package javabrains;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic (1, "Java Brains", "in28minutes"), new Topic(2, "Learn DevOps", "in28minutes"), new Topic(3, "Learn DevOps", "in28minutes")
			);
	
public List<Topic> getAllTopics(){
	return topics;
}
			

}
