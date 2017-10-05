/**
 * 
 */
package za.co.fynbos.ess.portal.repository;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.util.DateFormatConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import ch.qos.logback.classic.pattern.DateConverter;
import za.co.fynbos.ess.portal.domain.Employee;

/**
 * @author NMandisa Mkhungo
 *
 */


@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Test
    public void testEmployeeFindByName() {
        entityManager.persist(new Employee((long) 1,"Noxolo","Mkhungo","30/04/1993","12192"));
        List<Employee> employee = employeeRepository.findByName("Noxolo");
        assertEquals("Noxolo Mandisa", employee.get(0).getName());
    }
	
}
