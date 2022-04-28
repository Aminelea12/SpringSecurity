package ma.emsi.jpaap;

import ma.emsi.jpaap.entities.Patient;
import ma.emsi.jpaap.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JpaApApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {

            patientRepository.save(new Patient(null,"amine",new Date(),false,22));
            patientRepository.save(new Patient(null,"mohammed",new Date(),false,22));
            patientRepository.save(new Patient(null,"anisa",new Date(),false,22));
            patientRepository.save(new Patient(null,"hajar",new Date(),false,22));
            patientRepository.save(new Patient(null,"mehdi",new Date(),false,22));
            patientRepository.save(new Patient(null,"nizar",new Date(),false,22));
            patientRepository.save(new Patient(null,"abdo",new Date(),false,22));
            patientRepository.save(new Patient(null,"younes",new Date(),false,22));
            patientRepository.save(new Patient(null,"Omar",new Date(),false,22));
            patientRepository.save(new Patient(null,"imane",new Date(),false,22));
            patientRepository.save(new Patient(null,"mahmoud",new Date(),false,22));
            patientRepository.save(new Patient(null,"lamiae",new Date(),false,22));
            patientRepository.save(new Patient(null,"hicham",new Date(),false,22));
            patientRepository.save(new Patient(null,"othmane",new Date(),false,22));
            patientRepository.save(new Patient(null,"ghita",new Date(),false,22));
            patientRepository.save(new Patient(null,"rachid",new Date(),false,22));
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });

        };
    }
}
