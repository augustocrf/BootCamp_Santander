package br.com.acrf.aula3;

import java.util.stream.Collectors;


public class StringLinesExemplo {
    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n<body>\n</body>\n</html>";
        System.out.printf(html);
        System.out.println(html.lines().map(s -> s.contains("head")).collect(Collectors.toList()));
    }
}
