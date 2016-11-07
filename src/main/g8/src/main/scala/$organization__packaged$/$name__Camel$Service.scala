package $organization$

import akka.http.scaladsl.server._
import akka.http.scaladsl.model._
import akka.actor.ActorSystem
import akka.stream.Materializer

trait $name;format="Camel"$Service extends Directives {
  implicit def system: ActorSystem
  implicit def materializer: Materializer

  val routes = path("status") {
    get {
      complete(HttpResponse(StatusCodes.OK))
    }
  }
}
