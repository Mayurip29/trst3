package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Arraystream1 {

	@Test
	public void test1() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("test");
		names.add("kpk");
		names.add("Add");
		names.add("Ayyd");
		names.add("kok");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);
			if (actual.startsWith("A")) {

				count++;

			}
			System.out.println(count);

		}
	}

	@Test
	public void streamfilter() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Selenium");
		names.add("Jira");
		names.add("ALm");
		names.add("UFT");
		names.add("Asset");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

		System.out.println(c);

	}



	@Test
	public void streammap() {
		ArrayList<String> names = new ArrayList<String>();

        Stream.of("selenium","Jira","Alm","UFT","Asset","Six","sec")
        .filter(s->s.startsWith("s"))
        .map(s->s.toUpperCase())
		 .forEach(s-> System.out.println(s));
    	 
          
         
        	 
         
         
         
         
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

		System.out.println(c);

	}

}
