package com.galvanize.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; //needed for mock get call below
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; //needed for mock content call below
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; //needed for mock status call below


@WebMvcTest
public class MathQueryStringsTest {

    @Autowired
    MockMvc mvc;

    @Test //basic page/query functionality test
    public void testMathQueryEndpointAdd() throws Exception {
        this.mvc.perform(get("/math/calculate?operation=add&x=2&y=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2 + 3 = 5"));
    }
    @Test //basic page/query functionality test
    public void testMathQueryEndpointSubtract() throws Exception {
        this.mvc.perform(get("/math/calculate?operation=subtract&x=2&y=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2 - 3 = -1"));
    }
    @Test //basic page/query functionality test
    public void testMathQueryEndpointMultiply() throws Exception {
        this.mvc.perform(get("/math/calculate?operation=multiply&x=2&y=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2 * 3 = 6"));
    }
    @Test //basic page/query functionality test
    public void testMathQueryEndpointDivide() throws Exception {
        this.mvc.perform(get("/math/calculate?operation=divide&x=2&y=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2 / 3 = 0"));
    }
    @Test //basic page/query functionality test
    public void testMathQueryEndpointNoOperation() throws Exception {
        this.mvc.perform(get("/math/calculate?x=2&y=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2 + 3 = 5"));
    }
    @Test //basic page/query functionality test
    public void testMathQuerySum() throws Exception {
        this.mvc.perform(post("/math/sum?n=1&n=2&n=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("1 + 2 + 3 = 6"));
    }

}
