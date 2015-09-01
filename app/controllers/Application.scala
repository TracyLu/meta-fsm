package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def tutorial = Action {
    Ok(views.html.tutorial.tutorial())
  }

  def tutorial_01 = Action {
    Ok(views.html.tutorial.tutorial_01())
  }

  def tutorial_02 = Action {
    Ok(views.html.tutorial.tutorial_02())
  }

  def tutorial_03 = Action {
    Ok(views.html.tutorial.tutorial_03())
  }

  def guide = Action {
    Ok(views.html.guide.index())
  }

  def guide_simple = Action {
    Ok(views.html.guide.guide_simple())
  }

  def guide_composite = Action {
    Ok(views.html.guide.guide_composite())
  }

  def guide_relational = Action {
    Ok(views.html.guide.guide_relational())
  }

  def contactUs = Action {
    Ok(views.html.contactUs.index())
  }
}
