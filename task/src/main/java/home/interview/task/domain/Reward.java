package home.interview.task.domain;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reward {

    private String customerId;
    private Map<Month, Integer> rewards;
    private int totalRewards;

    public Reward() {
        rewards = new HashMap<>();
    }
}
