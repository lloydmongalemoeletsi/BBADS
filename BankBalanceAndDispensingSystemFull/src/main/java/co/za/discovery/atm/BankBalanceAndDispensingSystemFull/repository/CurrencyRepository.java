package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Currency;
import org.springframework.data.repository.CrudRepository;


public interface CurrencyRepository extends CrudRepository<Currency,String> {
}
