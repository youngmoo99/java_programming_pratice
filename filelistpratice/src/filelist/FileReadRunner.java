package filelist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// 리스트 이용하여 출력
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		// stream이용하여 출력 필터로 소문자만
		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println);

	}

}
