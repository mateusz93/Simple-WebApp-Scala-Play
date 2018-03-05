package controllers

import javax.inject._

import play.api.i18n._
import play.api.mvc.{AbstractController, ControllerComponents}


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents,
                               langs: Langs) extends AbstractController(cc) with I18nSupport {

  val lang: Lang = langs.availables.head
  implicit val messages: Messages = MessagesImpl(lang, messagesApi)
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)   // get the messages for the given request
    Ok(views.html.index(""))
  }

  def ENLanguage = Action {
    Redirect("/").withLang(Lang("en"))
  }

  def PLLanguage = Action {
    Redirect("/").withLang(Lang("pl"))
  }

}
