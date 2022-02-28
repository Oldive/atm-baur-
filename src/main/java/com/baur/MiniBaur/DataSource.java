package com.baur.MiniBaur;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
