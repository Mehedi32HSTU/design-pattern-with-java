package design_patterns.strategy_pattern.compression_tool;

import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(List<String> files) {
		System.out.println("Files Compressed into ZIP. Thanks for using the tool.");

	}

}
