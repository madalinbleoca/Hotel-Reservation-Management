package dandelyon.hotelReservationManagement.service.implementation;

import dandelyon.hotelReservationManagement.model.Reservation;
import dandelyon.hotelReservationManagement.repository.RoomRepository;
import dandelyon.hotelReservationManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomImplementation implements RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomImplementation(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
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
