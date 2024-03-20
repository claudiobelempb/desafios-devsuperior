package br.com.surb.surbeventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Block extends JpaRepository<Block, Long> {
}
