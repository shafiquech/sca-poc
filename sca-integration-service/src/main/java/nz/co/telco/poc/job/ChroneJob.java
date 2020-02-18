package nz.co.telco.poc.job;

import java.util.Date;
import nz.co.telco.poc.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ChroneJob {

  @Autowired
  MapperService mapperService;

  @Scheduled(fixedRate = 1000 * 1 * 60)
  public void reportCurrentTime() {
    System.out.println("ChroneJob ---- " + new Date());
    mapperService.process();
  }
}