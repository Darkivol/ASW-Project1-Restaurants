package asw.project.ratings;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class RestaurantRatingController {
	
	private final Logger logger = Logger.getLogger("asw.project.ratings"); 

	@RequestMapping("/{city}/{restaurant}")
	public double getRestaurantRating(@PathVariable String city, @PathVariable String restaurant) {
		return Math.random() * 5; 
	}
}