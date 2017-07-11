package controllers

import play.api._
import play.api.mvc._

import org.apache.commons.lang.StringUtils

class Application extends Controller {

  def index = Action {
    //This html twirl works
    //Ok(views.html.index(StringUtils.trim("   Your new application is ready.   ")))
    
    //This Js twirl DOES NOT work
    Ok(views.js.generic.render("foo.js", "payload"))
  }

}
