package Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;
import stub.StubGradeSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GradServiceTest {

    private GradeSystem stubGradeSystem;
    private GradeService gradeService;

    @BeforeEach
    public void setup(){
        stubGradeSystem= mock(GradeSystem.class);
        gradeService=new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result=gradeService.calculateAverageGrades(9999999L);
        assertEquals(result,90.0);
    }
}
