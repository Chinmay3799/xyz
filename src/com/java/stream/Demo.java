package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Demo {
	
	
public static void main(String[] args) {
	
	
	ArrayList <String> name= new ArrayList();
	name.add("Ankita");
	name.add("Lalu");
	name.add("Janu");
	name.add("Apsra");
	Long l= name.stream().filter(s->s.startsWith("A")).count();
	//System.out.println(l);
	
	//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	//name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	name.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	ArrayList <String> name1= new ArrayList();
	name1.add("Sulekha");
	name1.add("Arpita");
	name1.add("Angela");
	
	
	Stream <String> newstream=Stream.concat(name.stream(),name1.stream());
	
	
	//boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("angela"));
	//System.out.println(flag);
//	Assert.assertTrue(flag);
	//newstream.sorted().forEach(s->System.out.println(s));
	
	 //newstream.filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
	  List <String> ls = Stream.of("akshda","apsra","anissa","julia","kendra").filter(s->s.startsWith("a")).sorted().collect(Collectors.toList());
           System.out.println(ls.get(1));
           
           



}
}
