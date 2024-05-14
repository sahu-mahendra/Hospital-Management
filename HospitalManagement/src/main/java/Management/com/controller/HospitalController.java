package Management.com.controller;

import Management.com.Entity.Doctor;
import Management.com.Entity.Patient;
import Management.com.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;


    @PostMapping("/patients")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
        Patient createPatient = hospitalService.createPatient(patient);
        return new ResponseEntity<>(createPatient, HttpStatus.CREATED);
    }


    @GetMapping("/patients")
    public  ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = hospitalService.getAllPatients();
        return new ResponseEntity<>(patients ,HttpStatus.OK);
    }



    @PostMapping("/doctors")
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor){
        Doctor createDoctor = hospitalService.createDoctor(doctor);
        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }

    @GetMapping("/doctors")
    public  ResponseEntity<List<Doctor>> getAllDoctors(){
        List<Doctor> doctors = hospitalService.getAllDoctors();
        return new ResponseEntity<>(doctors,HttpStatus.OK);
    }
}
