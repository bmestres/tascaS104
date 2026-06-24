package nivell02;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class TestStructure {

    @Test
    void twoEqual(){
        Structure struct01 = new Structure(3);
        Structure struct02 = new Structure(3);

        assertThat(struct01.getInteger()).isEqualTo(struct02.getInteger());
    }

    @Test
    void twoDifferent(){

        Structure struct01 = new Structure(3);
        Structure struct02 = new Structure(4);

        assertThat(struct01.getInteger()).isNotEqualTo(struct02.getInteger());

    }
}
