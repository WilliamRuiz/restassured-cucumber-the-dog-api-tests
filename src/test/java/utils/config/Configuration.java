package utils.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:conf/${environment}.properties"})
public interface Configuration extends Config{

    @Key("env.base.url")
    String baseUrl();

    @Key("env.dog.image.endpoint")
    String dogImagesEndpoint();

    @Key("env.breeds.endpoint")
    String breedsEndpoint();

    @Key("env.favourites.endpoint")
    String favouritesEndpoint();

    @Key("env.thedogapi.api.key")
    String apiKey();
}
