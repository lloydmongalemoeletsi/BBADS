package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Denomination;
import org.springframework.data.repository.CrudRepository;

public interface DenominationRepository extends CrudRepository<Denomination,Integer> {
}
