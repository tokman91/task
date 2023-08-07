package home.interview.task.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerPayload {

    private String customerId;
    private List<Transaction> transactions;
}
