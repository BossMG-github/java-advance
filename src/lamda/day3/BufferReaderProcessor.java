package lamda.day3;

import java.io.BufferedReader;
import java.io.IOException;


@FunctionalInterface
public interface BufferReaderProcessor {

  String process(BufferedReader br) throws IOException; // 버퍼리더는 예외처리 필수
}
