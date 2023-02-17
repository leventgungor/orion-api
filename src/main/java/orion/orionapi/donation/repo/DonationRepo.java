package orion.orionapi.donation.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import orion.orionapi.donation.doc.Donation;

public interface DonationRepo extends MongoRepository<Donation,Long> {
}
