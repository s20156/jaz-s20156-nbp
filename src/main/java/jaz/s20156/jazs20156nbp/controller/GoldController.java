package jaz.s20156.jazs20156nbp.controller;

import jaz.s20156.jazs20156nbp.model.Gold;
import jaz.s20156.jazs20156nbp.service.GoldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gold")
public class GoldController {
    private final GoldService goldService;

    public GoldController(GoldService goldService) {
        this.goldService = goldService;
    }

    @GetMapping("/{startDate}/{endDate}")
    public ResponseEntity<Gold> getCourse(@PathVariable String startDate, @PathVariable String endDate) {
        return ResponseEntity.ok(goldService.getPrice(startDate, endDate));
    }
}
