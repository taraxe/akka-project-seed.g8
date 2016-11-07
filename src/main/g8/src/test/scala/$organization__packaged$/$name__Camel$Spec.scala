package $organization$

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import org.scalatest.{FlatSpec, Matchers}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.model.StatusCodes

class $name;format="Camel"$Spec extends FlatSpec with Matchers with ScalatestRouteTest {

    val service = new $name;format="Camel"$Service {
      override implicit val system: ActorSystem = ActorSystem("test-actor-system")
      override implicit val materializer:ActorMaterializer = ActorMaterializer()
    }

    "$name;format="Camel"$Service" should "return OK for GET requests to status path" in {
      Get("/status") ~> service.routes ~> check {
        status === StatusCodes.OK
      }
    }

}
