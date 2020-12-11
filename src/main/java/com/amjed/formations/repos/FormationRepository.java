package com.amjed.formations.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amjed.formations.entities.Formation;

public interface FormationRepository  extends JpaRepository<Formation, Long>  {

}
