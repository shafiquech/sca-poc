package nz.co.telco.poc.controller;

import java.util.List;
import nz.co.telco.poc.model.CompanySchedule;
import nz.co.telco.poc.service.PersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/data")
@RestController
public class PersistanceServiceResource {

  @Autowired
  private PersistanceService persistanceService;

  @PostMapping("/schedule")
  public String saveCompanyData(@RequestBody CompanySchedule companySchedule) {
    persistanceService.insertCompanyData(companySchedule);
    return "SUCCESS";
  }

  @GetMapping("/schedule/{companyId}")
  public @ResponseBody
  List<CompanySchedule> getCompanyData(@PathVariable("companyId") String companyId) {

    List<CompanySchedule> companyData = persistanceService.getCompanyData(companyId);

    return companyData;
  }
}
