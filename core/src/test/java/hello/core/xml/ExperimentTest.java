package hello.core.xml;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExperimentTest {
    @Test
    public static void main(String[] args) {
        String a = "apple";
        String b = a;
        Assertions.assertThat(a).isSameAs(b);
        Assertions.assertThat(a).isEqualTo(b);
    }


}
