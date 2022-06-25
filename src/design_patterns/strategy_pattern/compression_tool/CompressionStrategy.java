package design_patterns.strategy_pattern.compression_tool;

import java.util.List;

public interface CompressionStrategy {
	public void compressFiles(List<String> files);

}
