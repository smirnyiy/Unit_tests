package seminar_1;

import static org.assertj.core.api.Assertions.assertThat;
import static seminars.first.Main.sum;

public class task6 {
    public static void main(String[] args) {
        expectedValue();
    }
    public static void expectedValue() {
//        assertThat(5).isEqualTo(sum(2, 3));
        assertThat(sum(2, 3)).isEqualTo(5);
    }
}
