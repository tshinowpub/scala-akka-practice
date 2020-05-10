package com.github.tshinow.orbit.application.controllers.auth

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}

@Singleton
class AuthenticationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def signup(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.signup())
  }
}
