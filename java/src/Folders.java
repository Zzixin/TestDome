import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Folders {
   public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
      //throw new UnsupportedOperationException("Waiting to be implemented.");
      List<String> names = new ArrayList<>();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(new InputSource(new StringReader(xml)));
      doc.getDocumentElement().normalize();
      NodeList nodeList = doc.getElementsByTagName("folder");

      for (int i = 0; i < nodeList.getLength(); i++) {
         Node node = nodeList.item(i);
         String name = node.getAttributes().getNamedItem("name").getNodeValue();
         if (name.charAt(0) == startingLetter){
            names.add(name);
         }
      }
      return names;
   }

   public static void main(String[] args) throws Exception {
      String xml =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                  "<folder name=\"c\">" +
                  "<folder name=\"program files\">" +
                  "<folder name=\"uninstall information\" />" +
                  "</folder>" +
                  "<folder name=\"users\" />" +
                  "</folder>";

      Collection<String> names = folderNames(xml, 'u');
      for(String name: names)
         System.out.println(name);
   }
}