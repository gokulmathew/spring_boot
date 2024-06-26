package javabrains;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable Integer id) {
		return topicService.getTopic(id);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
		topicService.updateTopic(id, topic);
	}

	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}

}
