package home.interview.task.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Transaction {

    private Month month;
    List<Item> items;
}
