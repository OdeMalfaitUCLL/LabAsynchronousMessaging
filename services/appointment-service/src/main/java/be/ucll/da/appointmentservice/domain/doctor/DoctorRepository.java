package be.ucll.da.appointmentservice.domain.doctor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    List<Doctor> findAllByFieldOfExpertise(String fieldOfExpertise);
}
