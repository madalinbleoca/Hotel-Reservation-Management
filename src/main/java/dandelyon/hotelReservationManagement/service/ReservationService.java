package dandelyon.hotelReservationManagement.service;

import dandelyon.hotelReservationManagement.model.Reservation;


public interface ReservationService {


    public Reservation bookRoom(Reservation reservation);

    public void cancelReservation(Long reservationId);

    public Reservation changeReservation(Long reservationId, Long newRoomId);

}
