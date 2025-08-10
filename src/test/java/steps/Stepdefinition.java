package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import utils.BaseAPI;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.containsString;

/**
 * Podemos criar step definitions para cada funcionalidade, se desejarmos.
 */
public class Stepdefinition extends BaseAPI {

    public String breedsURL = this.props.baseUrl() + this.props.breedsEndpoint();
    public String imagesURL = this.props.baseUrl() + this.props.dogImagesEndpoint();
    public String favouritesURL = this.props.baseUrl() + this.props.favouritesEndpoint();

    public Response response = null;

    @Given("que a API está disponível")
    public void queAAPIEstáDisponível() {
        given()
                .headers(this.headers)
                .when()
                .get(this.props.baseUrl())
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("message", containsString("The Dog API"));
    }

    /**
     * Testes Endpoint Information's Breeds
     */

    @When("eu faço uma consulta de todas as raças de cachorros")
    public void euFaçoUmaConsultaDeTodasAsRaçasDeCachorros() {
        response = given()
                .headers(this.headers)
                .when()
                .get(breedsURL);
        response
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Then("devem ser exibidas as informações dos cachorros por raça")
    public void devemSerExibidasAsInformaçõesDosCachorrosPorRaça() {

        response.then()
                .body(matchesJsonSchemaInClasspath("schemas/AllBreedsListSchema.json"));
    }

    /**
     * Testes Endpoint Random Breeds
     */

    @When("eu faço uma consulta de imagem aleatória")
    public void euFaçoUmaConsultaDeImagemAleatória() {
        String randomImagemURL = imagesURL + "/search";

        response = given()
                .headers(this.headers)
                .when()
                .get(randomImagemURL);
        response
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Then("uma imagem aleatória deve ser retornada com sucesso")
    public void umaImagemAleatóriaDeveSerRetornadaComSucesso() {
        response
                .then()
                .body(matchesJsonSchemaInClasspath("schemas/RandomImageSchema.json"));
    }

    /**
     * Testes Endpoint Informartion's Favourites
     */

    @When("eu faço uma consulta de favoritos")
    public void euFaçoUmaConsultaDeFavoritos() {
        response = given()
                .headers(this.headers)
                .when().log().all()
                .get(favouritesURL);
        response
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().all();
    }

    @Then("uma lista de imagens favoritas deve ser retornada com sucesso")
    public void umaListaDeImagensFavoritasDeveSerRetornadaComSucesso() {
    }
}
