package Day14;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class ParseCollegeXml  extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document Started...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Starting Element : "+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Ending Element : "+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters ::  "+new String(ch, start, length));
      ;
    }

    public static void main(String[] args) {
        try
        {
            SAXParserFactory fact =SAXParserFactory.newInstance();
            SAXParser parser = fact.newSAXParser();
            parser.parse(new File("C:\\Users\\kavin\\IdeaProjects\\MindBridge\\src\\Day14\\College.xml"),new ParseCollegeXml());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
