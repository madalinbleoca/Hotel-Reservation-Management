package dandelyon.hotelReservationManagement.service.implementation;

import dandelyon.hotelReservationManagement.model.Feedback;
import dandelyon.hotelReservationManagement.repository.FeedbackRepository;
import dandelyon.hotelReservationManagement.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackImplementation implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackImplementation(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public Feedback leaveFeedback(Feedback feedback) {
        return null;
    }
}
