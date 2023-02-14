package guru.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotesGenerator;

    public JokeServiceImpl() {
        quotesGenerator = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotesGenerator.getRandomQuote();
    }
}
