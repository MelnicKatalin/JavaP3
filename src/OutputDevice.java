import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputDevice {

    OutputStream outputStream;
    public OutputDevice(OutputStream outputStream) { this.outputStream = outputStream; }
    public void writeMessage(String mess) {
        try
        {
            outputStream.write(mess.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeMessage(Double mess) {
        try
        {
            outputStream.write(mess.byteValue());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeMessage(int numericalMessage) {
        try
        {
            outputStream.write(String.valueOf(numericalMessage).getBytes()   );
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void writeMessage(String[] messArr) {
        try
        {
            outputStream.write(String.valueOf(messArr).getBytes());
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
