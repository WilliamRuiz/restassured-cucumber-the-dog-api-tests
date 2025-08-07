package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import utils.BaseAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * Podemos criar step definitions para cada funcionalidade, se desejarmos.
 */
public class Stepdefinition extends BaseAPI {

    @Given("que a API está disponível")
    public void queAAPIEstáDisponível() {
        given()
                .headers(this.headers)
                .when()
                .get(this.props.baseUrl())
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("message", containsString("The Dog API"))
                .log().all();
    }

    /**
     * Testes Endpoint Information's Breeds
     */

    @When("eu faço uma consulta de todas as raças de cachorros")
    public void euFaçoUmaConsultaDeTodasAsRaçasDeCachorros() {

    }

    @Then("devem ser exibidas as informações dos cachorros por raça")
    public void devemSerExibidasAsInformaçõesDosCachorrosPorRaça() {
    }

    /**
     * Testes Endpoint Random Breeds
     */

    @When("eu faço uma consulta de imagem aleatória")
    public void euFaçoUmaConsultaDeImagemAleatória() {
    }

    @Then("uma imagem aleatória deve ser retornada com sucesso")
    public void umaImagemAleatóriaDeveSerRetornadaComSucesso() {
    }

    /**
     * Testes Endpoint Informartion's Favourites
     */

    @When("eu faço uma consulta de favoritos")
    public void euFaçoUmaConsultaDeFavoritos() {
    }

    @Then("uma lista de imagens favoritas deve ser retornada com sucesso")
    public void umaListaDeImagensFavoritasDeveSerRetornadaComSucesso() {
    }
}
