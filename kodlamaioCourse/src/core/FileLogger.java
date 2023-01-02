package core;

public class FileLogger implements ILogger{
    public void log(String data){
        System.out.println("Logged to File: " + data);
    }
}
