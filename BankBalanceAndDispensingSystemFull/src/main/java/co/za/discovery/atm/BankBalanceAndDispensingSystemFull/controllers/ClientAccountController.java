package co.za.discovery.atm.BankBalanceAndDispensingSystemFull.controllers;

import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.domain.ClientAccount;
import co.za.discovery.atm.BankBalanceAndDispensingSystemFull.repository.ClientAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ClientAccountController {

    @Autowired
    ClientAccountRepository clientAccountRepository;
    @RequestMapping("/accountDetails")
    public String getAccounts(Model model){
        List<ClientAccount> accounts = clientAccountRepository.findAll();
        model.addAttribute("accounts",accounts);
        return "accountDetails";
    }

    @RequestMapping("/accountDetails/{id}")
    public String getAccounts(Model model,@PathVariable("id") Integer id){
        List<ClientAccount> clientAccount = clientAccountRepository.findByClientId(id);
        model.addAttribute("accounts",clientAccount);
        return "accountDetails";
    }

}