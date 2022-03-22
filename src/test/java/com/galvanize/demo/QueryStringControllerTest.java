package com.galvanize.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired; // required import for @Autowired below
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; // required import for @WebMvcTest below
import org.springframework.test.web.servlet.MockMvc; // required import for MockMvc below
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; //needed for mock get call below
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; //needed for mock content call below
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; //needed for mock status call below

@WebMvcTest // allows testing without running entire Spring instance
public class QueryStringControllerTest {

    @Autowired //make a class to use for test suite Mvc
    MockMvc mvc; //Main entry point for server-side Spring MVC test support

    @Test
    public void getCatsReturnsAllTheCats() throws Exception {
        this.mvc.perform(get("/cats"))
                //see what is returned
                .andExpect(status().isOk()) //could use ".andExpect(status()" if you want generic return
                .andExpect(content().string("All the Cats"));
    }

    @Test
    public void getDogsAllowsSortByName() throws Exception {
        //request sent:
        this.mvc.perform(get("/dogs?sort=name"))
                //test assumptions:
                .andExpect(status().isOk())
                .andExpect(content().string("name is the sort"));
    }

}
