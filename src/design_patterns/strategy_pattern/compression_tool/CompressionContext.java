package design_patterns.strategy_pattern.compression_tool;

import java.util.List;

public class CompressionContext {

	private CompressionStrategy compressionStrategy;
	
	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
	    this.compressionStrategy = compressionStrategy;
	}
	public void createArchive(List<String> files) {
		this.compressionStrategy.compressFiles(files);
	}
}
