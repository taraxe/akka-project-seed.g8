package $organization$

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory


object $name;format="Camel"$ extends App with $name;format="Camel"$Service {
  override implicit val system = ActorSystem()
  override implicit val materializer = ActorMaterializer()

  val config = ConfigFactory.load()
  val interface = config.getString("http.interface")
  val port = config.getInt("http.port")

  Http().bindAndHandle(routes, interface, port)
}
