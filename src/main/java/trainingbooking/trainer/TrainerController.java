package trainingbooking.trainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class TrainerController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private TrainerRepository trainerRepository;
    private TrainerService trainerService;

    public TrainerController(TrainerRepository trainerRepository, TrainerService trainerService) {
        this.trainerRepository = trainerRepository;
        this.trainerService = trainerService;
    }
}
