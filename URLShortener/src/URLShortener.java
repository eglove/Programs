import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class URLShortener {
    static HashMap<String, String> urls = new HashMap<>();

    public static void main(String[] args) {
        initialInput();
    }

    private static void initialInput() {
        String choice = getUserInput("1. Shorten URL\n2. Get long URL.\nEnter choice: ");

        if(choice.equals("1")) {
            shorten();
        } else if(choice.equals("2")) {
            restore();
        } else {
            System.out.println("Invalid input.");
            initialInput();
        }
    }

    private static void restore() {
        String shortURL = getUserInput("Enter short URL to expand: ");
        System.out.println(urls.getOrDefault(shortURL, "URL not found."));
        initialInput();
    }

    private static void shorten() {
        String longURL = getUserInput("Enter URL to shorten: ");
        String urlSuffix = generateURLSuffix();

        while(urls.containsKey(urlSuffix)) {
            urlSuffix = generateURLSuffix();
        }

        urls.put("https://short.com/" + urlSuffix, longURL);
        System.out.println("Short URL: https://short.com/" + urlSuffix);
        initialInput();
    }

    private static String generateURLSuffix() {
        // Generate URL
        String possibleCharactersForURL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder url = new StringBuilder(6);
        for(int i = 0; i < url.capacity(); i++) {
            int index = (int)(possibleCharactersForURL.length() * Math.random());
            url.append(possibleCharactersForURL.charAt(index));
        }

        return url.toString();
    }

    private static String getUserInput(String message) {
        Console console = System.console();
        System.out.print(message);
        return console.readLine();
    }
}
