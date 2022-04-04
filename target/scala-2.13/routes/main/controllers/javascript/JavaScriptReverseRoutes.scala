// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:10
package controllers.javascript {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseHR(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:26
    def add_employee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.add_employee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_emp"})
        }
      """
    )
  
    // @LINE:20
    def validate_login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.validate_login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
        }
      """
    )
  
    // @LINE:28
    def val_emp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.val_emp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "val_emp"})
        }
      """
    )
  
    // @LINE:34
    def update_emp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.update_emp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update_emp"})
        }
      """
    )
  
    // @LINE:24
    def add_user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.add_user",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_user"})
        }
      """
    )
  
    // @LINE:30
    def show_emp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.show_emp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show_emp"})
        }
      """
    )
  
    // @LINE:22
    def create_user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.create_user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create_user"})
        }
      """
    )
  
    // @LINE:36
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HR.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
