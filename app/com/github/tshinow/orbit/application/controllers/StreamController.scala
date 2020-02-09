package com.github.tshinow.orbit.application.controllers

import com.github.tshinow.orbit.application.resources.StreamResource
import com.github.tshinow.orbit.domain.value._
import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class StreamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val streamingService: StreamingService = Youtube

    val response = Seq(
      Map("id" -> "1", "name" -> "テストチャンネル", "streamingService" -> streamingService.value),
      Map("id" -> "2", "name" -> "テストサブチャンネル", "streamingService" -> streamingService.value)
    )

    val str = """
    {
      "id": "1",
      "name": "Youtube"
    }
    """

    //val stream: StreamResource = Json.parse(str).validate[StreamResource]

    Ok(Json.toJson(response))
  }
}
