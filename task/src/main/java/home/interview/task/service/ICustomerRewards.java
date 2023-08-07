package home.interview.task.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
import home.interview.task.domain.Reward;

public interface ICustomerRewards {

    Reward getCustomerRewards(String customerPayload) throws JsonProcessingException, InvalidDatatypeValueException;
}
