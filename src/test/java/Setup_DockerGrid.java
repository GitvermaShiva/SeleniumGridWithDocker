import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Setup_DockerGrid {

    @BeforeTest
    void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start start_docker_grid.bat");
        Thread.sleep(15000); // Wait for the grid to start
    }

    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_docker_grid.bat");
        Thread.sleep(5000); // Wait for the grid to stop
        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe"); // Close the command prompt windows
    }
}
