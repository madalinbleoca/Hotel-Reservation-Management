package dandelyon.hotelReservationManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservation")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Data checkIn;

    @Temporal(TemporalType.TIMESTAMP)
    private Data checkOut;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}
