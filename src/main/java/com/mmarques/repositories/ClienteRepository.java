package com.mmarques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mmarques.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	//Só pelo fato de criar o método com o nome findByEmail o Spring Data tem a inteligencia de implementar 
	//toda regra para procurar o registro pelo campo email.
	// Ao colocar a anotação @Transactional(readOnly=true) ela não fará locking na base e melhorará a performance.
}
