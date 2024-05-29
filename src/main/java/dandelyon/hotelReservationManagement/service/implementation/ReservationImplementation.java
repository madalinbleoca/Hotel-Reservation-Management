package dandelyon.hotelReservationManagement.service.implementation;

import dandelyon.hotelReservationManagement.model.Reservation;
import dandelyon.hotelReservationManagement.repository.ReservationRepository;
import dandelyon.hotelReservationManagement.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationImplementation implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationImplementation(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation bookRoom(Reservation reservation) {
        return null;
    }

    @Override
    public void cancelReservation(Long reservationId) {

    }

    @Override
    public Reservation changeReservation(Long reservationId, Long newRoomId) {
        return null;
    }
}
