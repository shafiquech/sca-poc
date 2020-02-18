package nz.co.telco.poc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nz.co.telco.poc.model.CompanySchedule;
import org.springframework.stereotype.Service;

@Service
public class PersistanceServiceImpl implements PersistanceService {

  List<CompanySchedule> list = new ArrayList<>();

  public int insertCompanyData(CompanySchedule companySchedule) {

    list.add(companySchedule);
    return 0;
  }

  public List<CompanySchedule> getCompanyData(String companyId) {

    return list.stream().filter(x -> x.getCompanyID().equals(Long.valueOf(companyId)))
        .collect(Collectors.toList());
  }
}