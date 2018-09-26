package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Client;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.ClientAccount;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;



public interface ClientAccountRepository extends CrudRepository<ClientAccount,String> {
    List<ClientAccount> findAll();
    @Query("Select c from ClientAccount c Join c.clientId cl where cl.clientId =:id order by c.displayBalance desc")
    List<ClientAccount> findByClientId(@Param("id") Integer id);
    @Query("select ca.clientAccountNumber,ca.currencyCode,ca.displayBalance,cr.rate, cr.conversionIndicator from ClientAccount ca, CurrencyConversionRate cr where ca.clientId= :id and ca.currencyCode=cr.currencyCode order by ca.displayBalance desc")
    List<ClientAccount> findCurrencyById(@Param("id") Client id);
    @Query("Select c from ClientAccount c Join c.clientId cl where c.clientAccountNumber =:clientAccountNumber order by c.displayBalance desc")
    List<ClientAccount> findClientAccountByAccountNumber(@Param("clientAccountNumber") String clientAccountNumber);

    @Modifying
    @Transactional
    //@Query("Update ca.displayBalance set ca.displayBalance = (ca.displayBalance - 20),CASE WHEN ccl.accountLimit  < =:amountRequested THEN  END FROM ClientAccount ca, CreditCardLimit ccl WHERE ca.clientAccountNumber = ccl.clientAccountNumber AND ca.clientAccountNumber=:clientAccountNumber")
    //void updateClientBalance(@Param("clientAccountNumber") String clientAccountNumber,@Param("amountRequested") Integer amountRequested);
    @Query("Update ClientAccount ca set ca.displayBalance = ca.displayBalance - 100 WHERE ca.clientAccountNumber =:clientAccountNumber")
    void updateClientBalance(@Param("clientAccountNumber") String clientAccountNumber);

}
