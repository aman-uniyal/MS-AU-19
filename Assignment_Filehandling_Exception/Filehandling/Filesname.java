import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Filesname {

	public static void main(String[] args) {
		try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\aman.uniyal\\Downloads"))) {

			java.util.List<String> result = walk.filter(Files::isRegularFile)
					.map(x -> x.toString()).collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	

}
