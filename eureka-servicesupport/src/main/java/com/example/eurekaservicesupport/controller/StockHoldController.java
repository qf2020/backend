package  com.example.eurekaservicesupport.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.service.StockHoldService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockHoldController {

    @Resource
    StockHoldService stockHoldService;

    @GetMapping("/getStockHold")
    @CrossOrigin
    public List<Map<String, Object>> getStockHold(int clientId, @RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer currentPage){
        return stockHoldService.getStockHold(clientId, pageSize, currentPage);
    }
}
