package nz.co.telco.poc.service;
import  nz.co.telco.poc.model.CompanySchedule;

import java.util.List;

public interface PersistanceService  {
    public int insertCompanyData(CompanySchedule companySchedule);
    public List<CompanySchedule> getCompanyData(String companyId);
}