package dandelyon.hotelReservationManagement.service.implementation;

import dandelyon.hotelReservationManagement.model.Hotel;
import dandelyon.hotelReservationManagement.repository.HotelRepository;
import dandelyon.hotelReservationManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelImplementation implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelImplementation(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> findHotelByRadius(double latitude, double longitude, double radius) {
        return List.of();
    }
}
