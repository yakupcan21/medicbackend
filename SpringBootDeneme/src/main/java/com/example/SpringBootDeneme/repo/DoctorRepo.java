package com.example.SpringBootDeneme.repo;
import com.example.SpringBootDeneme.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface DoctorRepo extends JpaRepository<Doctor,Long>{
}
