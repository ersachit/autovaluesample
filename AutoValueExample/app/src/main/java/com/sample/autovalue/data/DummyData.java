package com.sample.autovalue.data;

import com.sample.autovalue.model.Address;
import com.sample.autovalue.model.EmployeeData;

import java.util.Arrays;

/**
 * Created by sachit on 15/01/18.
 */

public interface DummyData {

    Address address = Address.create("New Delhi", "Janakpuri");

    EmployeeData employeeData = EmployeeData.create(1L, "Sachit", true,
            Arrays.asList(address));


}
