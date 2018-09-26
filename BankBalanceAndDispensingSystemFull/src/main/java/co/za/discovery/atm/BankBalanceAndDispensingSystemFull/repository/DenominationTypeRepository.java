package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.DenominationType;
import org.springframework.data.repository.CrudRepository;

public interface DenominationTypeRepository extends CrudRepository<DenominationType,String> {
}
