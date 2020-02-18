package nz.co.telco.poc.controller;

import java.util.List;
import nz.co.telco.poc.model.CompanySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/web")
public class ScaWebController {

  public static final String persistance_service_url = "http://sca-persistance-service/";

  @Autowired
  private RestTemplate restTemplate;


  @RequestMapping("/companydata/{companyId}")
  public List<CompanySchedule> getDataByID(@PathVariable("companyId") String companyId) {

    String getUrl = persistance_service_url + "data/schedule/1";
    ResponseEntity<List<CompanySchedule>> responseEntity = restTemplate.exchange(getUrl,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<CompanySchedule>>() {
        });
    return responseEntity.getBody();
  }
}
