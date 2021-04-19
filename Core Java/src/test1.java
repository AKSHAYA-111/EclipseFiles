import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the students article");
		String article=sc.nextLine();
		String[] allwords=article.split("[,;:?!]");
		List<String> words=Arrays.stream(allwords)
				            .filter(string->!string.isEmpty())
				            .collect(Collectors.toList());
		List<String> uniqueswords=words.stream()
				                  .map(String::toLowerCase)
				                  .distinct()
				                  .sorted()
				                  .collect(Collectors.toList());
		System.out.println("num od words"+words.size());
		System.out.println("num of unique words"+uniqueswords.size());
		System.out.println("the words are");
		IntStream.range(0, uniqueswords.size())
		    .forEach(i->System.out.println(String.format("%d.%s",(i+1),uniqueswords.get(i))));
		
		
	}

}
