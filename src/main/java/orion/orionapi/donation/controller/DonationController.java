package orion.orionapi.donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import orion.orionapi.donation.dto.DonationRequestDto;
import orion.orionapi.donation.service.DonationService;

@RestController
@RequestMapping("/donation")
public class DonationController {

    @Autowired
    DonationService donationService;

    @RequestMapping(value = "/make")
    @PostMapping
    public void makeADonation(@RequestBody DonationRequestDto donationRequestDto) {
        donationService.makeADonation(donationRequestDto);
    }
}
