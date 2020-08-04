package Mockito;

import mock.DoorPanel;
import mock.MockDoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.StubGradeSystem;

import static org.mockito.Mockito.mock;

public class SecurityCenterTest {
    private SecurityCenter securityCenter;
    public  DoorPanel mockDoorPanel ;
    @BeforeEach
    public void setUp() {
        mockDoorPanel=mock(DoorPanel.class);;
        securityCenter=new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        mockDoorPanel.verifyThatMockDoorPanelWasCalled();
    }
}
