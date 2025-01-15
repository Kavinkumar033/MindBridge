package Day12;

import java.nio.CharBuffer;

public class JavaNio {
    public static void main(String[] args) {
        String str ="Welcome...! Kavin Kumar";
        CharBuffer read = CharBuffer.allocate(25);
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            read.put(ch);
        }
        CharBuffer write = CharBuffer.allocate(25);
        read.flip();
        while (read.hasRemaining())
        {
            write.put(read.get());
        }
        write.flip();
        read.flip();
       // System.out.println(read.position()+write.position());
        System.out.println("String : "+str);
        System.out.println("Text Inside the write  : "+write.toString());
    }
}
