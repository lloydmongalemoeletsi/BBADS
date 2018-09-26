package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.controllers;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.ClientAccount;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository.ClientAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WithdrawController {

    @Autowired
    ClientAccountRepository clientAccountRepository;

    @RequestMapping(value = "/withdraw",method = RequestMethod.GET)
    public String withdraw(Model model,@RequestParam(value = "clientAccountNumber") String clientAccountNumber){
        List<ClientAccount> withdrawings = clientAccountRepository.findClientAccountByAccountNumber(clientAccountNumber);
        model.addAttribute("withdrawings",withdrawings);
        return "withdraw";

    }

    @RequestMapping(value = "/withdrawAmount",method = RequestMethod.GET)
    public String withdrawAmount(Model model,@RequestParam(value = "clientAccountNumber") String clientAccountNumber){
        clientAccountRepository.updateClientBalance(clientAccountNumber);
        model.addAttribute("clientAccountNumber",clientAccountNumber);
        return "results";
    }


}
