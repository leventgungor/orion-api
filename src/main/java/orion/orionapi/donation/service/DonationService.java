package orion.orionapi.donation.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orion.orionapi.donation.dto.DonationRequestDto;
import orion.orionapi.donation.doc.Donation;
import orion.orionapi.donation.repo.DonationRepo;

import java.util.random.RandomGenerator;

@Service
public class DonationService {

    @Autowired
    DonationRepo donationRepo;

    @Autowired
    ModelMapper modelMapper;

    public void makeADonation(DonationRequestDto donationRequestDto) {
        Donation donation = modelMapper.map(donationRequestDto, Donation.class);
        donation.setId(RandomGenerator.getDefault().nextLong());
        Donation saved = donationRepo.save(donation);
    }


}
