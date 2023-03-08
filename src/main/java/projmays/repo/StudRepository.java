package projmays.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import projmays.beans.StudentInfo;


public interface StudRepository extends JpaRepository<StudentInfo, Long> {

}
