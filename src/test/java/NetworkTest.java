import org.junit.Test;

public class NetworkTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThen1Second() {
        Network.getConnection();
    }
}
