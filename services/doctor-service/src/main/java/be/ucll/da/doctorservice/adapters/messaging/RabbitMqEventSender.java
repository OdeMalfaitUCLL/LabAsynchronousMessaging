package be.ucll.da.doctorservice.adapters.messaging;

import be.ucll.da.appointmentservice.client.doctor.model.ApiDoctor;
import be.ucll.da.appointmentservice.client.doctor.model.DoctorCreatedEvent;
import be.ucll.da.doctorservice.domain.Doctor;
import be.ucll.da.doctorservice.domain.EventSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqEventSender implements EventSender {
    private final RabbitTemplate rabbitTemplate;
    public RabbitMqEventSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    @Override
    public void sendDoctorCreatedEvent(Doctor doctor) {
        rabbitTemplate.convertAndSend("x.doctor-created", "",toEvent(doctor));
    }
    private DoctorCreatedEvent toEvent(Doctor doctor) {
        return new DoctorCreatedEvent()
                .doctor(new ApiDoctor()
                        .id(doctor.getId())
                        .age(doctor.getAge())
                        .address(doctor.getAddress())
                        .lastName(doctor.getLastName())
                        .firstName(doctor.getFirstName())
                        .fieldOfExpertise(doctor.getFieldOfExpertise()));
    }

}
