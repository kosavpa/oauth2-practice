package owlhome.practice.services;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestService {
    private RestTemplate template;
    private HttpHeaders headers;

    public RestService(String accessToken) {
        this.template = new RestTemplate();
        if (accessToken != null) {
            this.headers = new HttpHeaders();
            headers.setBearerAuth(accessToken);
        }
    }

    public ResponseEntity<String> getProtectInfo() {
        return template.exchange("http://localhost:9090", HttpMethod.GET, new HttpEntity<>(headers), String.class);
    }
}
