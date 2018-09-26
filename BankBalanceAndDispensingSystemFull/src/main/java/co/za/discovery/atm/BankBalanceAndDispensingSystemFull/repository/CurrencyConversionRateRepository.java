package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Currency;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.CurrencyConversionRate;
import org.springframework.data.repository.CrudRepository;


public interface CurrencyConversionRateRepository extends CrudRepository<CurrencyConversionRate,Currency> {
}
