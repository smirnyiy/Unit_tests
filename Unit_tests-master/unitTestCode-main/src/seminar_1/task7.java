package seminar_1;

import static org.assertj.core.api.Assertions.assertThat;

public class task7 {
    public static void main(String[] args) {
        String[] colors = {"orange", "green", "violet", "aqua", "yellow", "blue", "gold"};

        testingJavaCollectionsAssertJ(colors);
    }


    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }
//    String[] colors = {"...", "...",};

//    testingJavaCollectionsAssertJ(colors);
}

