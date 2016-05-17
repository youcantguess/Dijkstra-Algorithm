/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trim3.TA.lab7;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author Vadim
 */
public class ReadXML {
    
    public ReadXML() {
        
    }
    
    public void start(ArrayList<Vertice> vertices, ArrayList<Edge> edges) {
        try {
            File fXmlFile = new File("src/trim3/TA/lab7/graphData.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);	
            doc.getDocumentElement().normalize();	
            NodeList nList;
          
            nList = doc.getElementsByTagName("vertice");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);		
		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;  
                        vertices.add(new Vertice(Integer.valueOf(eElement.getAttribute("id"))));
                }
            }  
            
            nList = doc.getElementsByTagName("edge");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);		
		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;  
                        edges.add(new Edge(Integer.valueOf(eElement.getAttribute("from")),
                                           Integer.valueOf(eElement.getAttribute("to")),
                                           Integer.valueOf(eElement.getAttribute("weight"))
                        ));
                }
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
