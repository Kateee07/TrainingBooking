package trainingbooking.place;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class PlaceController {
    private final Logger log= LoggerFactory.getLogger(this.getClass());

    private PlaceService placeService;
    private PlaceRepository placeRepository;

    public PlaceController(PlaceService placeService, PlaceRepository placeRepository) {
        this.placeService = placeService;
        this.placeRepository = placeRepository;
    }
}
