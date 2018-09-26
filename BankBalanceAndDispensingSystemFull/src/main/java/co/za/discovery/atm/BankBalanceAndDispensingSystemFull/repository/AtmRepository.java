package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Atm;
import org.springframework.data.repository.CrudRepository;

public interface AtmRepository extends CrudRepository<Atm,Integer> {
}
