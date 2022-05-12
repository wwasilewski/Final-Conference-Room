package com.sda.transporeon.finalconferenceroom.conference_room.model;

import com.sda.transporeon.finalconferenceroom.organization.model.Organization;
import com.sda.transporeon.finalconferenceroom.reservation.model.Reservation;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class ConferenceRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    private String roomName;
    private Integer level;
    private boolean availability;
    private Integer sittingPlaces;
    private Integer standingPlaces;
    @ManyToOne
    private Organization organization;
    @OneToMany(mappedBy = "conferenceRoom", cascade = CascadeType.REMOVE)
    private List<Reservation> reservations = new ArrayList<>();

}