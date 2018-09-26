package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.AtmLocation;
import org.springframework.data.repository.CrudRepository;

public interface AtmLocationRepository extends CrudRepository<AtmLocation,Integer> {
}
