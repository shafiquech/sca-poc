package nz.co.telco.poc.service;

import java.util.Date;
import nz.co.telco.poc.model.CompanySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapperService {

  @Autowired
  RestTemplate restTemplate;

  public static final String persistance_service_url = "http://sca-persistance-service/";

  public void process() {
    CompanySchedule companySchedule = new CompanySchedule();
    companySchedule.setCompanyID(100L);
    companySchedule.setCompanyID(1L);
    companySchedule.setCompanyName("SCA");
    companySchedule.setDate(new Date());
    companySchedule.setFromTime(new Date());
    companySchedule.setToTime(new Date());
    companySchedule.setDescription("This schedule is pushed from external system");

    String posUrl = persistance_service_url + "data/schedule";
    String respose = restTemplate.postForObject(posUrl, companySchedule, String.class);
    System.out.println("Data processes successfully " + respose);


  }
}
