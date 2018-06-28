import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EasiestExerciseEverTest {

    @Test
    void testSimpleEasiestExerciseEver(){
        String exerciseOutput = EasiestExerciseEver.makeOutputString();
        String expectedOutput = "*";
        assertEquals(expectedOutput, exerciseOutput);
    }
}