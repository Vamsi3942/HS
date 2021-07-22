package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Serializable>
{

}
