package dandelyon.hotelReservationManagement.service;


import dandelyon.hotelReservationManagement.model.Reservation;

public interface RoomService {

    public Reservation bookRoom(Reservation reservation);

    public void cancelReservation(Long reservationId);

    public Reservation changeReservation(Long reservationId, Long newRoomId);


}
