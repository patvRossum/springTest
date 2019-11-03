package com.vanross.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class template1 {

    template1(@JsonProperty("id") String id,
              @JsonProperty("name") String name,
              @JsonProperty("course") int course) {
    }
}
