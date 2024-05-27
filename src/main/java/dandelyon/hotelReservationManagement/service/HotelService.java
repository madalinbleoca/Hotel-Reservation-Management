package dandelyon.hotelReservationManagement.service;

import dandelyon.hotelReservationManagement.model.Hotel;
import dandelyon.hotelReservationManagement.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> findHotelByRadius(double latitude, double longitude, double radius) {

        return List.of();
    }
}
