package dandelyon.hotelReservationManagement.controller;

import dandelyon.hotelReservationManagement.model.Feedback;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    public ResponseEntity<Feedback> createFeedback(@Valid @RequestBody Feedback feedback) {

        // Handle the creation of the feedback, e.g., save to the database

        Feedback savedFeedback = new Feedback();
        return ResponseEntity.ok(savedFeedback);
    }
}
