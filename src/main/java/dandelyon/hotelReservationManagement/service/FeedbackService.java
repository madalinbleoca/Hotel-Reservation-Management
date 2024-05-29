package dandelyon.hotelReservationManagement.service;

import dandelyon.hotelReservationManagement.model.Reservation;
import dandelyon.hotelReservationManagement.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

   // public Reservation bookRoom(Reservation reservation) { }

    public void cancelReservation(Long reservationId) {
        // Implement cancellation logic
    }

    // public Reservation changeReservation(Long reservationId, Long newRoomId) {}


}
