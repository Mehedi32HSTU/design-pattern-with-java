package design_patterns.strategy_pattern.compression_tool;

import java.util.ArrayList;
import java.util.List;

public class CompressionDriverClass {
	public static void main(String[] args) {
		List<String> filesList = new ArrayList<>();
		filesList.add("ABC");
		filesList.add("DEF");
		filesList.add("GHI");
		filesList.add("JKL");
		CompressionContext compressionContext = new CompressionContext();
		compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
		compressionContext.createArchive(filesList);
		compressionContext.setCompressionStrategy(new RarCompressionStrategy());
		compressionContext.createArchive(filesList);
		compressionContext.setCompressionStrategy(new TarCompressionStrategy());
		compressionContext.createArchive(filesList);
	}

}
