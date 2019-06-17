

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Txtfilesname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Stream<Path> walk = Files.walk(Paths.get("C:\\\\Users\\\\aman.uniyal\\\\Downloads"))) {

			List<String> result = walk.map(x -> x.toString())
					.filter(f -> f.endsWith(".txt")).collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
