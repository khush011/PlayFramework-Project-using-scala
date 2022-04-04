// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:10
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:18
  class ReverseHR(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def delete: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:26
    def add_employee: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add_emp")
    }
  
    // @LINE:20
    def validate_login: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validate")
    }
  
    // @LINE:28
    def val_emp: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "val_emp")
    }
  
    // @LINE:34
    def update_emp: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update_emp")
    }
  
    // @LINE:24
    def add_user: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add_user")
    }
  
    // @LINE:30
    def show_emp: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "show_emp")
    }
  
    // @LINE:22
    def create_user: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create_user")
    }
  
    // @LINE:36
    def update: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:18
    def login: Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
