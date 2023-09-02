package expert.os.labs.persistence.nosql.cdi.news;

import jakarta.enterprise.event.Observes;

import java.util.function.Consumer;
import java.util.logging.Logger;

public class SpecificMedia implements Consumer<News> {

    private static final Logger LOGGER = Logger.getLogger(SpecificMedia.class.getName());

    @Override
    public void accept(@Observes @Specific News news) {
        LOGGER.info("It will only listen to the specific media: " + news.get());
    }
}
