package orion.orionapi.donation.dto;

import lombok.Data;

@Data
public class DonationRequestDto  {
    private String tckn;
    private String name;
    private String surname;
    private Double amount;
    private String currency;
}
