package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.controllers;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.Client;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.ClientAccount;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository.ClientAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CurrencyAccountController {

    @Autowired
    ClientAccountRepository clientAccountRepository;

    @RequestMapping("/currencyDetails/{id}")
    public String getCurrencyAccount(Model model, @PathVariable("id") Client id){
        List<ClientAccount> clientCurrency = clientAccountRepository.findCurrencyById(id);
        model.addAttribute("currency",clientCurrency);
        return "currencyDetails";
    }



}
