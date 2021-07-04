package jaz.s20156.jazs20156nbp.service;

import jaz.s20156.jazs20156nbp.model.Gold;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoldService {
    private final RestTemplate restTemplate;

    public GoldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Gold getPrice (String startDate, String endDate) {
        try {
            String url = "http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate + "/?format=json";
            Gold forEntity = restTemplate.getForEntity(url, Gold.class).getBody();
            return forEntity;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }
}
