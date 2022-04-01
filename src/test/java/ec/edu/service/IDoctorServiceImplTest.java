package ec.edu.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import ec.edu.modelo.Doctor;

@Transactional
@Rollback(value = true)
class IDoctorServiceImplTest {

	@Autowired
	private IDoctorService doctorService;
	
	@Test
	void testGuardarDoctor() {
		//fail("Not yet implemented");
		Doctor doc =  new Doctor();
		doc.setCedula("123");
		doc.setApellido("Tapia");
		doc.setCodigoSenecyt(12);
		doc.setFecha_nacimiento(LocalDateTime.of(1996, Month.MARCH, 12, 12, 0));
		doc.setNombre("Denis");
		doc.setSueldo(new BigDecimal(1000));
		assertThat(doc).isNotNull();
		this.doctorService.guardarDoctor(doc);
		
		assertThat(doc).isNotNull();
		
		Doctor doc1 =  new Doctor();
		doc1.setCedula("123");
		doc1.setApellido("Tapia");
		doc1.setCodigoSenecyt(12);
		doc1.setFecha_nacimiento(LocalDateTime.of(1996, Month.MARCH, 12, 12, 0));
		doc1.setNombre("Denis");
		doc1.setSueldo(new BigDecimal(1000));
		assertThat(doc1).isNotNull();
		this.doctorService.guardarDoctor(doc);
		
		
		
	}

	@Test
	void testActualizarDoctor() {
		//fail("Not yet implemented");
	}

	@Test
	void testBuscarDoctor() {
		//fail("Not yet implemented");
	}

	@Test
	void testEliminarDoctor() {
		//fail("Not yet implemented");
	}

}
