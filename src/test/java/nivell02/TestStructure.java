package nivell02;

import static nivell02.Structure.MAX_NUM;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class TestStructure {

    @Test
    void twoEqual(){
        Structure struct01 = new Structure();
        Structure struct02 = new Structure();

        struct01.setInteger(3);
        struct02.setInteger(3);

        assertThat(struct01.getInteger()).isEqualTo(struct02.getInteger());
    }

    @Test
    void twoDifferent(){

        Structure struct01 = new Structure();
        Structure struct02 = new Structure();

        struct01.setInteger(3);
        struct02.setInteger(4);

        assertThat(struct01.getInteger()).isNotEqualTo(struct02.getInteger());

    }

    @Test
    void sameReference(){
        Structure struct01 = new Structure();
        Structure struct02 = new Structure();

        struct01.setInteger(2);
        struct02.setInteger(struct01.getInteger());

        assertThat(struct01.getInteger()).isSameAs(struct02.getInteger());

    }

    @Test
    void differentReference(){

        Structure struct01 = new Structure();
        Structure struct02 = new Structure();

        struct01.setInteger(10000);
        struct02.setInteger(10000);

        assertThat(struct01.getInteger()).isNotSameAs(struct02.getInteger());
    }

    @Test
    void identicalArrays(){

        int[] array01 = {1, 2, 3, 4};
        int[] array02 = {1, 2, 3, 4};

        assertThat(array01).isEqualTo(array02);
    }

    @Test
    void differentArrays() {

        int[] array01 = {1, 2, 3, 4};
        int[] array02 = {1, 2, 3, 5};

        assertThat(array01).isNotEqualTo(array02);
    }
}
