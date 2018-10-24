package app

object MinimalApplication extends cask.MainRoutes {
  @cask.get("/")
  def hello() = {
    "<!doctype html>" + html.hello("Hello World")
  }

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    new String(request.readAllBytes()).reverse
  }

  initialize()
}