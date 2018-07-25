package org.tagdynamics.aggregator.common

import org.junit.Assert._
import org.junit.Test

class DTOSTests {

  @Test
  def `ElementState isDeleted, isNotCreated, isVisible should work`(): Unit = {
    // Note: variables `nc`, `del`, `es` are typed as `ElementState`

    val del: ElementState = Deleted
    assert(ElementState.isDeleted(del))
    assert(!ElementState.isNotCreated(del))
    assert(!ElementState.isVisible(del))

    val nc: ElementState = NotCreated
    assert(!ElementState.isDeleted(nc))
    assert(ElementState.isNotCreated(nc))
    assert(!ElementState.isVisible(nc))

    val es: ElementState = Visible(List("0:crossing", "a:road"))
    assert(!ElementState.isDeleted(es))
    assert(!ElementState.isNotCreated(es))
    assert(ElementState.isVisible(es))
  }

}