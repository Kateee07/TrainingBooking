package trainingbooking.trainer;

import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }
}
