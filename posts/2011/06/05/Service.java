package sample.service.impl;

import sample.common.service.IService;
import org.springframework.stereotype.Service;

@Service
public class Service implements IService {
  public ServiceResultDto serviceMethod() {
      return new ServiceResultDto();
  }
}