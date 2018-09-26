package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.AccountType;
import org.springframework.data.repository.CrudRepository;

public interface AccountTypeRepository extends CrudRepository<AccountType,String> {
}
