/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transformer.common;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author sydney
 */
public class UtilityPractice {

    public static boolean validate(final String clientXML, final String clientXSD) throws Exception {
        
        return true;
    }
    
    public static Object unmarshal(final String responseClientXML, final Class c) throws Exception{
        final JAXBContext context = JAXBContext.newInstance(c);
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        final Object o = unmarshaller.unmarshal(new StringReader(responseClientXML));
        return o;
    }
    
    public static String marshal(final Class c) throws Exception{
        final JAXBContext context = JAXBContext.newInstance(c);
        final Marshaller marshaller = context.createMarshaller();
        final StringWriter sw = new StringWriter();
        marshaller.marshal(c, sw);
        return sw.toString();
    }
    
    private static Document createDocument(final String clientXML) throws Exception{
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final Document document = documentBuilder.parse(new InputSource(new StringReader(clientXML)));
        return document;
    }
    
}
