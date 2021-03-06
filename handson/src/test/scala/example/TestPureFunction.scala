package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestPureFunction extends FlatSpec with Matchers{

  it should "cook a strawberry dessert" in {
    //PureFunction.strawberry = "BlueBerry"
    assert(PureFunction.cookDessert(PureFunction.ingredientList) == "Awesome Strawberry cream", " --  :( I really like strawberries")
    PureFunction.iAlreadyAteStrawberries()
    assert(PureFunction.tryToCookSomethingWithAGlutton() == "Awesome Strawberry cream", " --  :( I really like strawberries")
  }
}
