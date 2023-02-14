package guru.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotesGenerator;

    public JokesServiceImpl() {
        quotesGenerator = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return quotesGenerator.getRandomQuote();
    }
}
