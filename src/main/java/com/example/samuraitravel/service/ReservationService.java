package com.example.samuraitravel.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.samuraitravel.entity.Reservation;
import com.example.samuraitravel.entity.User;
import com.example.samuraitravel.repository.ReservationRepository;



@Service
public class ReservationService {
	private final ReservationRepository reservationRepository;
	
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	public Page<Reservation> findReservationsByUserOrderByCreatedAtDesc(User user,Pageable pageable){
		return reservationRepository.findByUserOrderByCreatedAtDesc(user,pageable );
	}
	
}
	
