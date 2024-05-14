package Management.com.service;

import Management.com.Entity.Doctor;
import Management.com.Entity.Patient;
import Management.com.repository.AppointmentRepository;
import Management.com.repository.DoctorRepository;
import Management.com.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class HospitalService {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;


    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long id){
        return  patientRepository.findById(id);
    }

    public Doctor createDoctor(Doctor doctor){
        return doctorRepository.save(doctor);

    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }


}
