package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Genders;

@Repository
public interface GendersRepository extends JpaRepository<Genders, Serializable> 
{

}
