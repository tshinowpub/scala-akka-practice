package com.github.tshinow.orbit.application.controllers.auth

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}
import play.api.Configuration

@Singleton
class AuthenticationController @Inject()(val controllerComponents: ControllerComponents, val configuration: Configuration) extends BaseController {
  def signup(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val baseUrl = configuration.get[String]("baseUrl")

    Ok(views.html.signup(baseUrl))
  }
}
