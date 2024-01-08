package com.example.SpringBootDeneme.repo;
import com.example.SpringBootDeneme.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface doctorRepository extends JpaRepository<doctor,Long>{
}
