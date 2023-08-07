package home.interview.task.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
import home.interview.task.domain.*;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class CustomerRewardsService implements ICustomerRewards {

    @PostMapping(path = "/rewards")
    @Override
    public Reward getCustomerRewards(@RequestBody String customerPayloadRequest) throws JsonProcessingException, InvalidDatatypeValueException {

        CustomerPayload customerPayload = new ObjectMapper().readValue(customerPayloadRequest, new TypeReference<CustomerPayload>() {});

        Reward reward = new Reward();
        reward.setCustomerId(customerPayload.getCustomerId());
        int totalRewards = 0;

        for (Transaction transaction : customerPayload.getTransactions()) {

            int customerReward = 0;
            for (Item item : transaction.getItems()) {
                if (item.getPrice() > 100) {
                    customerReward += 50 + (item.getPrice()-100) * 2;
                } else if (item.getPrice() > 50) {
                    customerReward += item.getPrice() - 50;
                }
            }
            reward.getRewards().put(transaction.getMonth(), customerReward);
            totalRewards += customerReward;
        }
        reward.setTotalRewards(totalRewards);

        return reward;
    }
}
