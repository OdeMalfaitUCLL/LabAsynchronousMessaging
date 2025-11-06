package be.ucll.da.appointmentservice.adapters.messaging;

import be.ucll.da.appointmentservice.client.doctor.model.DoctorCreatedEvent;
import be.ucll.da.appointmentservice.domain.doctor.Doctor;
import be.ucll.da.appointmentservice.domain.doctor.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DoctorCreatedEventListener {
    private final static Logger LOGGER = LoggerFactory.getLogger(DoctorCreatedEventListener.class);
    private final DoctorRepository doctorRepository;
    public DoctorCreatedEventListener(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    @RabbitListener(queues = {"q.doctor-appointment-service"})
    public void onDoctorCreated(DoctorCreatedEvent event) {
        LOGGER.info("Received doctorCreatedEvent...");
        doctorRepository.save(new Doctor(event.getDoctor().getId(), event.getDoctor().getFieldOfExpertise()));
    }

}
