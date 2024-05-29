package dandelyon.hotelReservationManagement.service;

import dandelyon.hotelReservationManagement.model.Hotel;
import dandelyon.hotelReservationManagement.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {


    public List<Hotel> findHotelByRadius(double latitude, double longitude, double radius);


}
