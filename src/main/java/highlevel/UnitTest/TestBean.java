package highlevel.UnitTest;

import lombok.Data;

@Data
public class TestBean {
    private String content;

    public TestBean(String content) {
        this.content = content;
    }
}
