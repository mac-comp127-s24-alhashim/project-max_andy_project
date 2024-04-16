import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class java {
    File file = new File(("/Desktop/Macalester/13th Fresh/2024 Spring/COMP 127 Obj-Ori Prog&Abstr/GitHub/project-max_andy_project/src/python.py"));

    List<String> list = new ArrayList<String>();
    list.add("python.exe");
    String absPath = file.getAbsolutePath();

    System.out.println("absPath>>"+absPath);

    list.add(absPath);
    ProcessBuilder pb = new ProcessBuilder(list);
    Process process = pb.start();

    InputStream inputStream = process.getInputStream();
    byte[] b = new byte[1024 * 1024];// {(byte) 1024};
    while (inputStream.read(b) > 0) {
        System.out.println("b.length>>"+new String(b));
    }
}
